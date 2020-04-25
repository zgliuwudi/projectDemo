package com.mybatis.demo.encrypt.service.impl;

import com.mybatis.demo.encrypt.entity.BankCard;
import com.mybatis.demo.encrypt.dao.BankCardDao;
import com.mybatis.demo.encrypt.service.BankCardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BankCard)表服务实现类
 *
 * @author makejava
 * @since 2020-04-25 10:17:32
 */
@Service("bankCardService")
public class BankCardServiceImpl implements BankCardService {
    @Resource
    private BankCardDao bankCardDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BankCard queryById(Integer id) {
        return this.bankCardDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BankCard> queryAllByLimit(int offset, int limit) {
        return this.bankCardDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param bankCard 实例对象
     * @return 实例对象
     */
    @Override
    public BankCard insert(BankCard bankCard) {
        this.bankCardDao.insert(bankCard);
        return bankCard;
    }

    /**
     * 修改数据
     *
     * @param bankCard 实例对象
     * @return 实例对象
     */
    @Override
    public BankCard update(BankCard bankCard) {
        this.bankCardDao.update(bankCard);
        return this.queryById(bankCard.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.bankCardDao.deleteById(id) > 0;
    }

    @Override
    public void insertBankCardEncrypt(BankCard bankCard) {
        this.bankCardDao.insertBankCardEncrypt(bankCard);
    }
}