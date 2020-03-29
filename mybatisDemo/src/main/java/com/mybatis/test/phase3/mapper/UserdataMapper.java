package com.mybatis.test.phase3.mapper;

import com.mybatis.test.phase3.pojo.Userdata;
import com.mybatis.test.phase3.pojo.UserdataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserdataMapper {
    long countByExample(UserdataExample example);

    int deleteByExample(UserdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userdata record);

    int insertSelective(Userdata record);

    List<Userdata> selectByExample(UserdataExample example);

    Userdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userdata record, @Param("example") UserdataExample example);

    int updateByExample(@Param("record") Userdata record, @Param("example") UserdataExample example);

    int updateByPrimaryKeySelective(Userdata record);

    int updateByPrimaryKey(Userdata record);
}