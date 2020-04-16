package com.common.web;

import java.io.Serializable;

/**
 * @description 统一 API响应结果封装
 * @author sgc
 */
public class ApiResponse<T> implements Serializable { 
	private static final long serialVersionUID = 1L;
	public static final int SUCCESS = 0;

	/**
	 * 响应状态码
	 */
	private long status;
	/**
	 * 响应提示信息
	 */
	private String statusText;
	/**
	 * 响应结果对象
	 */
	private T data;

	public ApiResponse() {
		status = SUCCESS;
		statusText = "Success";
	}

	public ApiResponse(long status, String statusText, T data) {
		super();
		this.status = status;
		this.statusText = statusText;
		this.data = data;
	}

	public ApiResponse(T data) {
//		super();
//		if (data instanceof BusinessException) {
//			status = -2;
//			statusText = ((BusinessException) data).getMessage();
//		} else if (data instanceof Exception) {
//			status = -1;
//			statusText = ExceptionUtils.getFullStackTrace(((Exception) data));
//		} else {
//			status = SUCCESS;
//			statusText = "Success";
//			this.data = data;
//		}
		this.status = SUCCESS;
		this.statusText = "Success";
		this.data = data;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public Object getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
