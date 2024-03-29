package com.trans.translator.common.utils;

import com.trans.translator.common.emuns.ResultCodeEmuns;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * 后台返回给所有终端的统一封装
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/15 23:38
 * @param <T>
 */
@Configuration
public class JsonResult<T> implements Serializable {

	private Boolean success;
	private Integer errorCode;
	private String errorMsg;
	private T data;

	public JsonResult() {
	}

	public JsonResult(boolean success) {
		this.success = success;
		this.errorCode = success ? ResultCodeEmuns.SUCCESS.getCode() : ResultCodeEmuns.COMMON_FAIL.getCode();
		this.errorMsg = success ? ResultCodeEmuns.SUCCESS.getMessage() : ResultCodeEmuns.COMMON_FAIL.getMessage();
	}

	public JsonResult(boolean success, ResultCodeEmuns resultEnum) {
		this.success = success;
		this.errorCode = success ? ResultCodeEmuns.SUCCESS.getCode() : (resultEnum == null ? ResultCodeEmuns.COMMON_FAIL.getCode() : resultEnum.getCode());
		this.errorMsg = success ? ResultCodeEmuns.SUCCESS.getMessage() : (resultEnum == null ? ResultCodeEmuns.COMMON_FAIL.getMessage() : resultEnum.getMessage());
	}

	public JsonResult(boolean success, T data) {
		this.success = success;
		this.errorCode = success ? ResultCodeEmuns.SUCCESS.getCode() : ResultCodeEmuns.COMMON_FAIL.getCode();
		this.errorMsg = success ? ResultCodeEmuns.SUCCESS.getMessage() : ResultCodeEmuns.COMMON_FAIL.getMessage();
		this.data = data;
	}

	public JsonResult(boolean success, ResultCodeEmuns resultEnum, T data) {
		this.success = success;
		this.errorCode = success ? ResultCodeEmuns.SUCCESS.getCode() : (resultEnum == null ? ResultCodeEmuns.COMMON_FAIL.getCode() : resultEnum.getCode());
		this.errorMsg = success ? ResultCodeEmuns.SUCCESS.getMessage() : (resultEnum == null ? ResultCodeEmuns.COMMON_FAIL.getMessage() : resultEnum.getMessage());
		this.data = data;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
