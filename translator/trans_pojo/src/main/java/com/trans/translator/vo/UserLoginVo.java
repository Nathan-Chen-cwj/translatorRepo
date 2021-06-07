package com.trans.translator.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/1 23:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginVo {
    /**
     * 用户id
     */
    private String id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户头像
     */
    private String img;
    /**
     * 用户性别
     */
    private String sex;
    /**
     * 账号类型 u_category 0表示普通用户，1表示企业用户
     */
    private int userType;
    /**
     * 账号等级
     */
    private int userLevel;
    /**
     * 账号状态 1冻结、2禁言、0正常
     */
    private int status;
}
