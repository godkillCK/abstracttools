package com.abstracttools.web.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.abstracttools.web.dao.UserMapper;
import com.abstracttools.web.model.User;


public class UserController {
    @Autowired
    static
    UserMapper userMapper;

    public static void main(String[] args) {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getName());
    }

}