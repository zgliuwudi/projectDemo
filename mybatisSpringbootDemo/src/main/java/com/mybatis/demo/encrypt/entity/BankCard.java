package com.mybatis.demo.encrypt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (BankCard)实体类
 *
 * @author makejava
 * @since 2020-04-25 10:17:09
 */
public class BankCard implements Serializable {
    private static final long serialVersionUID = 352965903433779109L;
    
    private Integer id;
    
    private Date gmtCreate;
    
    private Date gmtUpdate;
    /**
    * 卡号
    */
    private String cardNo;
    /**
    * 手机号
    */
    private String phone;
    /**
    * 姓名
    */
    private String name;
    /**
    * 证件号
    */
    private String idNo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

}