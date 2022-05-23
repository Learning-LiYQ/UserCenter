package com.lyq.usercenter.service;

import com.lyq.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        user.setUsername("lyqTest");
        user.setUserAccount("123");
        user.setAvatarUrl("https://himg.bdimg.com/sys/portrait/item/pp.1.79a7fb3a.815pWmfAH7n0psRmeMDyUA.jpg?tt=1652512609711");
        user.setGender(0);
        user.setUserPassword("123");
        user.setPhone("456");
        user.setEmail("789");

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        //账户不为空
        String userAccount = "";
        String userPassword = "123456";
        String checkPassword = "123456";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //账户长度不小于4位
//        userAccount = "lyq";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //密码长度不小于8位
//        userAccount = "lyq_777";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //账户不包含特殊字符
//        userPassword = "123456789";
//        checkPassword = "123456789";
//        userAccount = "ly qqq";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
//        //密码和校验密码相同
//        userPassword = "987654321";
//        result = userService.userRegister(userAccount, userPassword, checkPassword);
//        Assertions.assertEquals(-1, result);
        //账户不能重复
//        userPassword = "123456789";
//        checkPassword = "123456789";
//        userAccount = "lyqTest";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword, );
//        Assertions.assertTrue(result > 0);
//        //成功
//        userAccount = "cyqTest";
//        userPassword = "987654321";
//        checkPassword = "987654321";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, );
//        Assertions.assertTrue(result > 0);
    }
}