package com.test.mybatisplusdemo.mapper;

import com.test.mybatisplusdemo.pojo.Userdata;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName: UserdataMapperTest
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-29 16:45
 * @Version: 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserdataMapperTest {

    @Autowired
    private UserdataMapper userdataMapper;

    @Test
    public void test1(){
        List<Userdata> userdata = userdataMapper.selectList(null);
        System.out.println(userdata);
    }
}
