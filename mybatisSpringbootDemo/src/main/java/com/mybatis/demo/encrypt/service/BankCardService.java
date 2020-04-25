package com.mybatis.demo.encrypt.service;

import com.mybatis.demo.encrypt.entity.BankCard;
import java.util.List;

/**
 * (BankCard)表服务接口
 *
 * @author makejava
 * @since 2020-04-25 10:17:31
 */
public interface BankCardService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BankCard queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BankCard> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param bankCard 实例对象
     * @return 实例对象
     */
    BankCard insert(BankCard bankCard);

    /**
     * 修改数据
     *
     * @param bankCard 实例对象
     * @return 实例对象
     */
    BankCard update(BankCard bankCard);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    void insertBankCardEncrypt(BankCard bankCard);

}