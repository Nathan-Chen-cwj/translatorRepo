package com.trans.translator.controller.web.securiy;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/15 20:28
 * springboot security 配置类
 * ctrl + o 快速重写父类方法
 * 以下默认使用thymeleaf技术
 */
//@EnableWebSecurity
public class SpringBootWebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 定义授权规则
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*
            定制请求授权规则
            1、放行首页所有请求
            2、 .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");
              以上表示，要访问level1下的请求需要vip1的请求，后续同理
         */
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");
        /*
            开启登陆的功能，如果没有登陆，没有认证就会来到登陆页面
            1、默认login来到登陆页面
                1.1 定制登陆页面.loginPage("/userLogin")跳转到/userLogin页面，
                登陆页面需要提交表单必须发get请求，发送post请求是做认证登
                1.2 一旦定制loginPage 那么loginPage的post请求就是登陆
            2、重定向到/login?error登陆失败
            3、更多详细规则
         */
        http.formLogin().loginPage("/userLogin");

        /*
            开启自动配置的注销
            表示用户注销，并访问session
            访问/logout 并且默认的提交方式是post
            .logoutSuccessUrl("")退出成功后的地址
         */
        http.logout().logoutSuccessUrl("/logoutSuccessPage");

        /*
            开启记住我功能
            要定制，就需要在表单中自己写一个input 命名的name为remember-me，
            或者自己使用.rememberMeParameter()修改input的name
         */
        http.rememberMe().rememberMeParameter("remember");
    }

    /**
     * 定义认证规则
     * 1、从数据库中获取认证用户信息
     * auth.jdbcAuthentication().withUser("nathan").password("1234").roles("vip1","vip2")
     *                 .and().withUser("vessel").password("1234").roles("vip2","vip3");
     * 2、从内存中获取认证用户信息
     * auth.inMemoryAuthentication().withUser("nathan").password("1234").roles("vip1","vip2")
     *                 .and().withUser("vessel").password("1234").roles("vip2","vip3");
     *
     * 如果访问失败就把密码写成{noop}+密码
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("nathan").password(new BCryptPasswordEncoder().encode("1234")).roles("vip1","vip2")
                .and()
                .withUser("vessel").password(new BCryptPasswordEncoder().encode("1234")).roles("vip2","vip3");
    }
}
