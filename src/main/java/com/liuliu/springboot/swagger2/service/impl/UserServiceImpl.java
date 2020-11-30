package com.liuliu.springboot.swagger2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuliu.springboot.swagger2.entity.User;
import com.liuliu.springboot.swagger2.mapper.UserMapper;
import com.liuliu.springboot.swagger2.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getByid(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

}
