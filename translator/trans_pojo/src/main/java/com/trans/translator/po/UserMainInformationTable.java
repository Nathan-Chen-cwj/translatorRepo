package com.trans.translator.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`user_main_information_table`")
public class UserMainInformationTable implements Serializable {
    /**
     * 用户的id
     */
    @Id
    @Column(name = "`u_id`")
    private String uId;

    /**
     * 用户名，用户登录系统的昵称，可用于用户登录
     */
    @Column(name = "`u_username`")
    private String uUsername;

    /**
     * 用户登录密码，用于用户登录
     */
    @Column(name = "`u_password`")
    private String uPassword;

    /**
     * 用于存储用户的性别
     */
    @Column(name = "`u_sex`")
    private String uSex;

    /**
     * 用户生日
     */
    @Column(name = "`birthday`")
    private Date birthday;

    /**
     * 用于存储用户的电子邮箱
     */
    @Column(name = "`u_email`")
    private String uEmail;

    /**
     * 用于识别是普通用户还是企业用户，0表示普通用户，1表示企业用户
     */
    @Column(name = "`u_category`")
    private Integer uCategory;

    /**
     * 用户等级标签
     */
    @Column(name = "`u_level_label`")
    private Integer uLevelLabel;

    /**
     * 存储用户的头像地址信息
     */
    @Column(name = "`u_img`")
    private String uImg;

    /**
     * 存储用户的手机号码
     */
    @Column(name = "`u_phone`")
    private String uPhone;

    /**
     * 存储账号状态 1冻结、2禁言、0正常等
     */
    @Column(name = "`u_status`")
    private Integer uStatus;

    /**
     * 存储用户创建账号的时间
     */
    @Column(name = "`created_time`")
    private Date createdTime;

    /**
     * 用户信息更新时间
     */
    @Column(name = "`updated_time`")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户的id
     *
     * @return u_id - 用户的id
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置用户的id
     *
     * @param uId 用户的id
     */
    public void setuId(String uId) {
        this.uId = uId;
    }

    /**
     * 获取用户名，用户登录系统的昵称，可用于用户登录
     *
     * @return u_username - 用户名，用户登录系统的昵称，可用于用户登录
     */
    public String getuUsername() {
        return uUsername;
    }

    /**
     * 设置用户名，用户登录系统的昵称，可用于用户登录
     *
     * @param uUsername 用户名，用户登录系统的昵称，可用于用户登录
     */
    public void setuUsername(String uUsername) {
        this.uUsername = uUsername;
    }

    /**
     * 获取用户登录密码，用于用户登录
     *
     * @return u_password - 用户登录密码，用于用户登录
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * 设置用户登录密码，用于用户登录
     *
     * @param uPassword 用户登录密码，用于用户登录
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    /**
     * 获取用于存储用户的性别
     *
     * @return u_sex - 用于存储用户的性别
     */
    public String getuSex() {
        return uSex;
    }

    /**
     * 设置用于存储用户的性别
     *
     * @param uSex 用于存储用户的性别
     */
    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    /**
     * 获取用户生日
     *
     * @return birthday - 用户生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置用户生日
     *
     * @param birthday 用户生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取用于存储用户的电子邮箱
     *
     * @return u_email - 用于存储用户的电子邮箱
     */
    public String getuEmail() {
        return uEmail;
    }

    /**
     * 设置用于存储用户的电子邮箱
     *
     * @param uEmail 用于存储用户的电子邮箱
     */
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    /**
     * 获取用于识别是普通用户还是企业用户，0表示普通用户，1表示企业用户
     *
     * @return u_category - 用于识别是普通用户还是企业用户，0表示普通用户，1表示企业用户
     */
    public Integer getuCategory() {
        return uCategory;
    }

    /**
     * 设置用于识别是普通用户还是企业用户，0表示普通用户，1表示企业用户
     *
     * @param uCategory 用于识别是普通用户还是企业用户，0表示普通用户，1表示企业用户
     */
    public void setuCategory(Integer uCategory) {
        this.uCategory = uCategory;
    }

    /**
     * 获取用户等级标签
     *
     * @return u_level_label - 用户等级标签
     */
    public Integer getuLevelLabel() {
        return uLevelLabel;
    }

    /**
     * 设置用户等级标签
     *
     * @param uLevelLabel 用户等级标签
     */
    public void setuLevelLabel(Integer uLevelLabel) {
        this.uLevelLabel = uLevelLabel;
    }

    /**
     * 获取存储用户的头像地址信息
     *
     * @return u_img - 存储用户的头像地址信息
     */
    public String getuImg() {
        return uImg;
    }

    /**
     * 设置存储用户的头像地址信息
     *
     * @param uImg 存储用户的头像地址信息
     */
    public void setuImg(String uImg) {
        this.uImg = uImg;
    }

    /**
     * 获取存储用户的手机号码
     *
     * @return u_phone - 存储用户的手机号码
     */
    public String getuPhone() {
        return uPhone;
    }

    /**
     * 设置存储用户的手机号码
     *
     * @param uPhone 存储用户的手机号码
     */
    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    /**
     * 获取存储账号状态 1冻结、2禁言、0正常等
     *
     * @return u_status - 存储账号状态 1冻结、2禁言、0正常等
     */
    public Integer getuStatus() {
        return uStatus;
    }

    /**
     * 设置存储账号状态 1冻结、2禁言、0正常等
     *
     * @param uStatus 存储账号状态 1冻结、2禁言、0正常等
     */
    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    /**
     * 获取存储用户创建账号的时间
     *
     * @return created_time - 存储用户创建账号的时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置存储用户创建账号的时间
     *
     * @param createdTime 存储用户创建账号的时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取用户信息更新时间
     *
     * @return updated_time - 用户信息更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置用户信息更新时间
     *
     * @param updatedTime 用户信息更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}