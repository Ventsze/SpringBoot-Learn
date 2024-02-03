package com.ventsze.springbootmybatis.controller;

import com.ventsze.springbootmybatis.pojo.User;
import com.ventsze.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    public User findById(Integer id){
        return userService.findByid(id);

    }

}
