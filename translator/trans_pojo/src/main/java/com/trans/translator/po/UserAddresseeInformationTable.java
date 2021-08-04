package com.trans.translator.po;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`user_addressee_information_table`")
public class UserAddresseeInformationTable implements Serializable {
    /**
     * 用户收件表的id
     */
    @Id
    @Column(name = "`addressee_id`")
    private String addresseeId;

    /**
     * 用户id，与用户主要信息表的形成外键关系
     */
    @Column(name = "`u_uid`")
    private String uUid;

    /**
     * 收件人名
     */
    @Column(name = "`addressee_name`")
    private String addresseeName;

    /**
     * 收件人收件号码
     */
    @Column(name = "`addressee_phone`")
    private String addresseePhone;

    /**
     * 收件人收件地址
     */
    @Column(name = "`addressee_address`")
    private String addresseeAddress;

    /**
     * 是否为默认地址，1表示默认，0表示不是默认
     */
    @Column(name = "`is_default`")
    private Integer isDefault;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户收件表的id
     *
     * @return addressee_id - 用户收件表的id
     */
    public String getAddresseeId() {
        return addresseeId;
    }

    /**
     * 设置用户收件表的id
     *
     * @param addresseeId 用户收件表的id
     */
    public void setAddresseeId(String addresseeId) {
        this.addresseeId = addresseeId;
    }

    /**
     * 获取用户id，与用户主要信息表的形成外键关系
     *
     * @return u_uid - 用户id，与用户主要信息表的形成外键关系
     */
    public String getuUid() {
        return uUid;
    }

    /**
     * 设置用户id，与用户主要信息表的形成外键关系
     *
     * @param uUid 用户id，与用户主要信息表的形成外键关系
     */
    public void setuUid(String uUid) {
        this.uUid = uUid;
    }

    /**
     * 获取收件人名
     *
     * @return addressee_name - 收件人名
     */
    public String getAddresseeName() {
        return addresseeName;
    }

    /**
     * 设置收件人名
     *
     * @param addresseeName 收件人名
     */
    public void setAddresseeName(String addresseeName) {
        this.addresseeName = addresseeName;
    }

    /**
     * 获取收件人收件号码
     *
     * @return addressee_phone - 收件人收件号码
     */
    public String getAddresseePhone() {
        return addresseePhone;
    }

    /**
     * 设置收件人收件号码
     *
     * @param addresseePhone 收件人收件号码
     */
    public void setAddresseePhone(String addresseePhone) {
        this.addresseePhone = addresseePhone;
    }

    /**
     * 获取收件人收件地址
     *
     * @return addressee_address - 收件人收件地址
     */
    public String getAddresseeAddress() {
        return addresseeAddress;
    }

    /**
     * 设置收件人收件地址
     *
     * @param addresseeAddress 收件人收件地址
     */
    public void setAddresseeAddress(String addresseeAddress) {
        this.addresseeAddress = addresseeAddress;
    }

    /**
     * 获取是否为默认地址，1表示默认，0表示不是默认
     *
     * @return is_default - 是否为默认地址，1表示默认，0表示不是默认
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否为默认地址，1表示默认，0表示不是默认
     *
     * @param isDefault 是否为默认地址，1表示默认，0表示不是默认
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
}