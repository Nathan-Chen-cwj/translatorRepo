package com.trans.translator.common.utils;

/**
 * 后台返回给所有终端的统一封装
 * 
 * @author Monty
 *
 */
public class JsonResult {

	/**
	 * 当前相应的状态，如果成功应该是200
	 * 
	 * 500 代码异常 401 未授权 400 请求参数非法 各个状态码有不同的含义
	 */
	public int status;
	/**
	 * 如果请求有数据，那么放在data中
	 */
	public Object data;
	/**
	 * 如果请求错误，那么返回错误信息
	 */
	private String msg;

	public JsonResult() {
	}

	public JsonResult(int status, Object data, String msg) {
		this.status = status;
		this.data = data;
		this.msg = msg;
	}

	public static JsonResult isOk(Object data) {
		return new JsonResult(200, data, "success");
	}

	public static JsonResult err(String msg) {
		return new JsonResult(500, null, msg);
	}

	public static JsonResult errBadRequest(Object data, String msg) {
		return new JsonResult(400, data, msg);
	}

	public static JsonResult errAuthorize(String msg) {
		return new JsonResult(401, null, msg);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
