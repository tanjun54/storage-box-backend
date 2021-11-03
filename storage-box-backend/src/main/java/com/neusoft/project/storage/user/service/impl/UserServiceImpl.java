package com.neusoft.project.storage.user.service.impl;

import com.neusoft.project.storage.user.domain.User;
import com.neusoft.project.storage.user.mapper.UserMapper;
import com.neusoft.project.storage.user.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
//查询用户
    private final UserMapper userMapper;
    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public List<User> queryList() {
        return userMapper.queryAll();
    }

    //新增用户
    @Override
    public void incon(User queryList) {
        userMapper.incon(queryList);
    }

    //删除用户
    @Override
    public int delete(Long userId) {
        return userMapper.delete(userId);
    }



}
