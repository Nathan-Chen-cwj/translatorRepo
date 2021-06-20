package com.trans.translator.advice;

import com.trans.translator.common.emuns.ResultCode;
import com.trans.translator.common.utils.JsonResult;
import com.trans.translator.common.utils.JsonResultReturnTool;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/6 21:58
 *
 * 异常处理器处理程序可能发生的异常
 *      主要用于：用于工程出现异常时进行前端控制显示、打印异常日志等
 *
 * 关于@RestControllerAdvice和@ControllerAdvice
 *      当自定义类加@ControllerAdvice注解时，方法需要返回json数据时，每个方法还需要添加@ResponseBody注解；
 *      当自定义类加@RestControllerAdvice注解时，方法自动返回json数据，每个方法无需再添加@ResponseBody注解
 *   因为@RestControllerAdvice源码中已经帮我们添加了@ResponseBody注解
 */
@RestControllerAdvice
public class ApplicationExceptionHandler {

    /**
     * 所有的Exception都归该方法处理
     * 注解 @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
     * 表示程序发生500错误，意思就是一切异常，
     * 当然要是命中自定义的异常，就先去自定义的异常
     *
     * 注解 @ExceptionHandler(value = Exception.class) 捕获程序运行抛出的、上抛的异常，
     * 注解 @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
     * 带有@ResponseStatus注解的异常类会被ResponseStatusExceptionResolver 解析。
     * 可以实现自定义的一些异常,同时在页面上进行显示。
     * @param e 异常
     * @return JsonResult包含异常信息
     */
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public JsonResult handleExceptionRequest(Exception e) {
        e.printStackTrace();
        return JsonResultReturnTool.isError(ResultCode.COMMON_FAIL);
    }

}
