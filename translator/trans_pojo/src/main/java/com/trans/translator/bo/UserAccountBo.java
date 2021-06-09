package com.trans.translator.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/2 23:23
 *
 * 用户操作账号表相关信息bo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountBo {
    private String id;
    private String username;
    private String password;
    private String sex;
    private Date birthday;
    private String email;
    private String img;
    private String phone;
    /**
     * 验证码
     */
    private String verCode;
    private Date createdTime;
    private Date updatedTime;
    private String label1;
    private String label2;
    private String label3;
    private String label4;

}
