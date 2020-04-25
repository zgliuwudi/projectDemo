package com.mybatis.demo.encrypt.dao;

import com.mybatis.demo.encrypt.entity.BankCard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (BankCard)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-25 10:17:30
 */
@Mapper
public interface BankCardDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BankCard queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BankCard> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param bankCard 实例对象
     * @return 对象列表
     */
    List<BankCard> queryAll(BankCard bankCard);

    /**
     * 新增数据
     *
     * @param bankCard 实例对象
     * @return 影响行数
     */
    int insert(BankCard bankCard);

    /**
     * 修改数据
     *
     * @param bankCard 实例对象
     * @return 影响行数
     */
    int update(BankCard bankCard);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    int insertBankCardEncrypt(BankCard bankCard);

}