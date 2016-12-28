package com.xiao.test.loginmodule.service;

import SupportTest.SupportTest;
import com.xiao.mb.loginmodule.web.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiao on 2016/12/28.
 */
public class UserServiceTest extends SupportTest {

    @Autowired
    private UserService userService;
    @Test
    public void testfindByUserName(){
        String userName = "admin";
        System.out.println(userService.findByUsername(userName));
    }
}
