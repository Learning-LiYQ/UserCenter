package com.lyq.usercenter.common;

/**
 * 自定义错误码
 * @author lyq
 */
public enum ErrorCode {
    SUCCESS(0, "OK"),
    PARAMS_ERROR(40000, "请求参数错误"),
    NULL_ERROR(40001, "请求数据为空"),
    NOT_LOGIN(40100, "未登录"),
    NOT_ADMIN(40101, "无权限"),
    SYSTEM_ERROR(50000, "系统异常");

    /**
     * 状态码
     */
    private final int code;
    /**
     * 状态码的类型
     */
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
