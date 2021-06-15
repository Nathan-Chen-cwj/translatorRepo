package com.trans.translator.controller;

import com.trans.translator.common.utils.JsonResult;
import com.trans.translator.common.utils.JsonResultReturnTool;
import com.trans.translator.service.GetPublicMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/11 17:35
 *
 * 共有的获取信息的接口
 *  例如：
 *      获取手机验证码、图片验证码、可展示给全部用户的信息
 */
@RestController
@RequestMapping("/publicMsg")
public class GetPublicMsgController {

    @Autowired
    private GetPublicMsgService getPublicMsgService;

    /**
     * 获取手机验证码
     * @param mobile
     * @return
     */
    @GetMapping("/getMobileVerCode")
    public JsonResult sendSmsVerCode(String mobile){
        getPublicMsgService.getMobileVerCode(mobile);
        return JsonResultReturnTool.success("验证码已发送至您的手机，请注意查收！");
    }
}
