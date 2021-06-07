package com.trans.translator.web.controller;

import com.trans.translator.common.utils.JsonResult;
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
@RequestMapping("/baiDuTranslator")
public class BaiDuTransController {

    @Autowired
    private TransService transService;

    @GetMapping("/trans")
    public JsonResult getTransResult(String keywords,String from,String to){
        return JsonResult.isOk(transService.translateByBaiDu(keywords, from, to));
    }
}
