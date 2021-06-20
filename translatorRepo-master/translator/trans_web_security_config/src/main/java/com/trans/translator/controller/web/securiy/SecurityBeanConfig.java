package com.trans.translator.controller.web.securiy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/15 23:00
 * 安全方面的bean的配置类
 */
@Configuration
public class SecurityBeanConfig {
    /**
     * 数据加密功能
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
