package com.liuliu.springboot.swagger2.service;

import com.liuliu.springboot.swagger2.entity.User;

public interface UserService {

    User getByid(Integer id);

    int updateUser(User user);

    int deleteUserById(Integer id);

    int addUser(User user);
}
