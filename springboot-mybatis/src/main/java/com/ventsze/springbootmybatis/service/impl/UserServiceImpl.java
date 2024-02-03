package com.ventsze.springbootmybatis.service.impl;

import com.ventsze.springbootmybatis.mapper.UserMapper;
import com.ventsze.springbootmybatis.pojo.User;
import com.ventsze.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByid(Integer id) {
        return userMapper.findByid(id);
    }
}
