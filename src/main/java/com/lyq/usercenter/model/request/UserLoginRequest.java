package com.lyq.usercenter.model.request;

import lombok.Data;

/**
 * 用户登录请求体
 * @author lyq
 */
@Data
public class UserLoginRequest {
    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
