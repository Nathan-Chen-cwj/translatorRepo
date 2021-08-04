package com.trans.translator.po;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`user_jurisdiction_table`")
public class UserJurisdictionTable implements Serializable {
    /**
     * 用户id，与用户表形成外键关系
     */
    @Id
    @Column(name = "`u_id`")
    private String uId;

    /**
     * 权限id，用户可能包含多个权限，例如某些课程的观看权限，某些商品的折扣权限
     */
    @Column(name = "`power_id`")
    private Integer powerId;

    /**
     * 记录权限的类型，0表示无权限，1表示有权限
     */
    @Column(name = "`power_type`")
    private Integer powerType;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户id，与用户表形成外键关系
     *
     * @return u_id - 用户id，与用户表形成外键关系
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置用户id，与用户表形成外键关系
     *
     * @param uId 用户id，与用户表形成外键关系
     */
    public void setuId(String uId) {
        this.uId = uId;
    }

    /**
     * 获取权限id，用户可能包含多个权限，例如某些课程的观看权限，某些商品的折扣权限
     *
     * @return power_id - 权限id，用户可能包含多个权限，例如某些课程的观看权限，某些商品的折扣权限
     */
    public Integer getPowerId() {
        return powerId;
    }

    /**
     * 设置权限id，用户可能包含多个权限，例如某些课程的观看权限，某些商品的折扣权限
     *
     * @param powerId 权限id，用户可能包含多个权限，例如某些课程的观看权限，某些商品的折扣权限
     */
    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    /**
     * 获取记录权限的类型，0表示无权限，1表示有权限
     *
     * @return power_type - 记录权限的类型，0表示无权限，1表示有权限
     */
    public Integer getPowerType() {
        return powerType;
    }

    /**
     * 设置记录权限的类型，0表示无权限，1表示有权限
     *
     * @param powerType 记录权限的类型，0表示无权限，1表示有权限
     */
    public void setPowerType(Integer powerType) {
        this.powerType = powerType;
    }
}