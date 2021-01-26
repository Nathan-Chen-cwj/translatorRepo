package com.trans.login.service;

import com.trans.login.pojo.UserTable;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/1/17 21:17
 */
public interface LoginService {
    /**
     * 普通用户登录服务方法
     * @param userTable 前端传递的用于校验用户账号信息的参数
     * @return
     */
    public String userIsLogin(UserTable userTable);
}
