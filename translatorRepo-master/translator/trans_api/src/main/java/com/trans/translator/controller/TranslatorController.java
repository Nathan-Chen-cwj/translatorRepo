package com.trans.translator.controller;

import com.trans.translator.common.utils.JsonResult;
import com.trans.translator.common.utils.JsonResultReturnTool;
import com.trans.translator.service.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/6 15:27
 */
@RestController
@RequestMapping("/translator")
public class TranslatorController {

    @Autowired
    private TransService transService;

    @GetMapping("/baiduTrans")
    public JsonResult getBaiduTransResult(String keywords, String from, String to) {
        return JsonResultReturnTool.success(transService.translateByBaiDu(keywords, from, to));
    }

    @GetMapping("/tencentTrans")
    public JsonResult getTencentTransResult(String keywords, String from, String to) {
        return JsonResultReturnTool.success(transService.translateByBaiDu(keywords, from, to));
    }

    //TODO  完成谷歌翻译的参数传入
    @GetMapping("/googleTrans")
    public JsonResult getGoogleTransResult(String keywords, String from, String to) {
        return JsonResultReturnTool.success(transService.translateByGoogle(keywords, from, to));
    }

    @GetMapping("/youDaoTrans")
    public JsonResult getYouDaoTransResult(String keywords, String from, String to) {
        return JsonResultReturnTool.success(transService.translateByBaiDu(keywords, from, to));
    }
}
