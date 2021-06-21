package com.trans.translator.controller.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trans.translator.bo.UserAccountBo;
import com.trans.translator.common.utils.CookieUtils;
import com.trans.translator.common.utils.JsonResult;
import com.trans.translator.common.utils.JsonResultReturnTool;
import com.trans.translator.service.UserService;
import com.trans.translator.vo.UserLoginVo;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/15 16:48
 *
 * 增删查改
 */
@RestController
@RequestMapping("/webPassport")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("/register")
    public JsonResult registerUser(@RequestBody UserAccountBo userAccountBo) throws JsonProcessingException {
        UserLoginVo register = userService.register(userAccountBo);
        CookieUtils.setCookie(request,response,"user",objectMapper.writeValueAsString(register),68400,true);
        return JsonResultReturnTool.success(register);
    }

    /**
     * 获取当前已登陆的用户的认证凭证
     * @param authentication 认证凭证
     * @return 认证凭证的json样式
     * 后续用jwt技术在客户端保留登陆凭证 签名认证防伪
     */
    @GetMapping("/me")
    public JsonResult getUserAuthentication(Authentication authentication){
        return JsonResultReturnTool.success(authentication);
    }

}
