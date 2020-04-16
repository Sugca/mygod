package com.common.web;

/**
 * @description 响应结果生成工厂类
 * @author sgc
 */
public class ResultFactory {

    public static ApiResponse buildSuccessResult(Object data) {
        return buidResult(ResultCode.SUCCESS, "成功", data);
    }

    public static ApiResponse buildFailResult(String message) {
        return buidResult(ResultCode.FAIL, message, null);
    }

    public static ApiResponse buidResult(ResultCode resultCode, String message, Object data) {
        return buidResult(resultCode.status, message, data);
    }

    public static ApiResponse buidResult(long resultCode, String message, Object data) {
        return new ApiResponse(resultCode, message, data);
    }
}
