package com.lyq.usercenter.model.request;

import lombok.Data;

/**
 * 用户注册请求体
 * @author lyq
 */
@Data
public class UserRegisterRequest {
    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
