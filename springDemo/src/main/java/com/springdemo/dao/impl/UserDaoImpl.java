package com.springdemo.dao.impl;

import com.springdemo.dao.UserDao;
import com.springdemo.pojo.UserData;
import lombok.Getter;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @ClassName: UserDaoImpl
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-05 08:53
 * @Version: 1.0
 **/
public class UserDaoImpl implements UserDao {

    @Getter
    private DataSource dataSource;

    private Properties properties = new Properties();

    private String prePropertiesName = "db.sql.";

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        init();
    }

    public void init(){
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("sql.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<UserData> queryUser(String id, Object param) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        List<UserData> list = new ArrayList<>();
        String sql = properties.getProperty(prePropertiesName+id);
        System.out.println("sql="+sql);

        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            if (param instanceof String) {
                preparedStatement.setObject(1,param);
            }else {
                String paramName = properties.getProperty(prePropertiesName + id + ".param");
                String[] splits = paramName.split(",");
                for (int i = 0; i < splits.length; i++) {
                    String split = splits[i];
                    Class<?> aClass = param.getClass();
                    Field declaredField = aClass.getDeclaredField(split);
                    declaredField.setAccessible(true);
                    preparedStatement.setObject(i+1, declaredField.get(param));
                }
            }


            resultSet = preparedStatement.executeQuery();

            Class<UserData> dataClass = UserData.class;

            while (resultSet.next()) {
                UserData userData = dataClass.newInstance();

                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    Field field = dataClass.getDeclaredField(metaData.getColumnName(i + 1));
                    field.setAccessible(true);
                    field.set(userData, resultSet.getObject(i + 1));
                }
                list.add(userData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != resultSet) {
                    resultSet.close();
                }
                if (null != preparedStatement) {
                    preparedStatement.close();
                }
                if (null != connection) {
                    connection.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        return list;
    }
}
