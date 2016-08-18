package com.zsj.test;

import com.zsj.entity.User;
import com.zsj.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zsj on 2016/8/2.
 */

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        User user =  userService.checkUser("shabi","123");
        System.out.println(user.toString());

    }
}
