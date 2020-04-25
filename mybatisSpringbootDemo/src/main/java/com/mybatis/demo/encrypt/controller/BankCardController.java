package com.mybatis.demo.encrypt.controller;

import com.mybatis.demo.encrypt.entity.BankCard;
import com.mybatis.demo.encrypt.service.BankCardService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (BankCard)表控制层
 *
 * @author makejava
 * @since 2020-04-25 10:17:33
 */
@RestController
@RequestMapping("bankCard")
public class BankCardController {
    /**
     * 服务对象
     */
    @Resource
    private BankCardService bankCardService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BankCard selectOne(Integer id) {
        return this.bankCardService.queryById(id);
    }

    @PutMapping("insertOne")
    public void insertOne(BankCard bankCard){
        this.bankCardService.insert(bankCard);
    }

    @PutMapping("insertBankCardEncrypt")
    public void insertBankCardEncrypt(BankCard bankCard){
        this.bankCardService.insertBankCardEncrypt(bankCard);
    }

}