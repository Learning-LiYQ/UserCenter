package com.lyq.usercenter.service;

import com.lyq.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author lyq
* @description 针对表【User(用户)】的数据库操作Service
* @createDate 2022-05-14 15:01:35
*/

public interface UserService extends IService<User> {
    /**
     * 注册新用户
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 校验码
     * @param planetCode 星球编号
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param request 客户端的请求
     * @return 登录的用户
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * 除了登录时要脱敏，查询用户后也要脱敏
     * @param originUser
     * @return 脱敏后用户
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
