package com.trans.translator.exception;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/13 22:13
 */
public class LoginException extends UsernameNotFoundException {

    private static final long serialVersionUID = 3513232979528170051L;

    public LoginException(String msg) {
        super(msg);
    }
}
