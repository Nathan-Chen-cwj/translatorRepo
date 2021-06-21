package com.trans.translator.po;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`user_receiving_information_table`")
public class UserReceivingInformationTable implements Serializable {
    /**
     * 用户收件表的id
     */
    @Id
    @Column(name = "`user_receiving_information_id`")
    private Integer userReceivingInformationId;

    /**
     * 用户id，与用户主要信息表的形成外键关系
     */
    @Column(name = "`u_uid`")
    private Integer uUid;

    /**
     * 用于存储用户收件表当中的收件名
     */
    @Column(name = "`u_receiving_infromation_name`")
    private String uReceivingInfromationName;

    /**
     * 用于存储用户收件表当中的收件号码
     */
    @Column(name = "`u_receiving_infromation_phone`")
    private String uReceivingInfromationPhone;

    /**
     * 用于存储用户收件表当中的收件地址
     */
    @Column(name = "`u_receiving_infromation_address`")
    private String uReceivingInfromationAddress;

    /**
     * 是否为默认地址，1表示默认，0表示不是默认
     */
    @Column(name = "`u_receiving_infromation_defaultaddress`")
    private Integer uReceivingInfromationDefaultaddress;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户收件表的id
     *
     * @return user_receiving_information_id - 用户收件表的id
     */
    public Integer getUserReceivingInformationId() {
        return userReceivingInformationId;
    }

    /**
     * 设置用户收件表的id
     *
     * @param userReceivingInformationId 用户收件表的id
     */
    public void setUserReceivingInformationId(Integer userReceivingInformationId) {
        this.userReceivingInformationId = userReceivingInformationId;
    }

    /**
     * 获取用户id，与用户主要信息表的形成外键关系
     *
     * @return u_uid - 用户id，与用户主要信息表的形成外键关系
     */
    public Integer getuUid() {
        return uUid;
    }

    /**
     * 设置用户id，与用户主要信息表的形成外键关系
     *
     * @param uUid 用户id，与用户主要信息表的形成外键关系
     */
    public void setuUid(Integer uUid) {
        this.uUid = uUid;
    }

    /**
     * 获取用于存储用户收件表当中的收件名
     *
     * @return u_receiving_infromation_name - 用于存储用户收件表当中的收件名
     */
    public String getuReceivingInfromationName() {
        return uReceivingInfromationName;
    }

    /**
     * 设置用于存储用户收件表当中的收件名
     *
     * @param uReceivingInfromationName 用于存储用户收件表当中的收件名
     */
    public void setuReceivingInfromationName(String uReceivingInfromationName) {
        this.uReceivingInfromationName = uReceivingInfromationName;
    }

    /**
     * 获取用于存储用户收件表当中的收件号码
     *
     * @return u_receiving_infromation_phone - 用于存储用户收件表当中的收件号码
     */
    public String getuReceivingInfromationPhone() {
        return uReceivingInfromationPhone;
    }

    /**
     * 设置用于存储用户收件表当中的收件号码
     *
     * @param uReceivingInfromationPhone 用于存储用户收件表当中的收件号码
     */
    public void setuReceivingInfromationPhone(String uReceivingInfromationPhone) {
        this.uReceivingInfromationPhone = uReceivingInfromationPhone;
    }

    /**
     * 获取用于存储用户收件表当中的收件地址
     *
     * @return u_receiving_infromation_address - 用于存储用户收件表当中的收件地址
     */
    public String getuReceivingInfromationAddress() {
        return uReceivingInfromationAddress;
    }

    /**
     * 设置用于存储用户收件表当中的收件地址
     *
     * @param uReceivingInfromationAddress 用于存储用户收件表当中的收件地址
     */
    public void setuReceivingInfromationAddress(String uReceivingInfromationAddress) {
        this.uReceivingInfromationAddress = uReceivingInfromationAddress;
    }

    /**
     * 获取是否为默认地址，1表示默认，0表示不是默认
     *
     * @return u_receiving_infromation_defaultaddress - 是否为默认地址，1表示默认，0表示不是默认
     */
    public Integer getuReceivingInfromationDefaultaddress() {
        return uReceivingInfromationDefaultaddress;
    }

    /**
     * 设置是否为默认地址，1表示默认，0表示不是默认
     *
     * @param uReceivingInfromationDefaultaddress 是否为默认地址，1表示默认，0表示不是默认
     */
    public void setuReceivingInfromationDefaultaddress(Integer uReceivingInfromationDefaultaddress) {
        this.uReceivingInfromationDefaultaddress = uReceivingInfromationDefaultaddress;
    }
}