package com.trans.translator.common.utils;

import com.trans.translator.common.emuns.ResultCode;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/15 23:38
 */
public class JsonResultReturnTool {
    public static JsonResult success() {
        return new JsonResult(true);
    }

    public static <T> JsonResult<T> success(T data) {
        return new JsonResult(true, data);
    }

    public static JsonResult isError() {
        return new JsonResult(false);
    }

    public static JsonResult isError(ResultCode resultEnum) {
        return new JsonResult(false, resultEnum);
    }

}
