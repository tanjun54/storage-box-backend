package com.neusoft.project.storage.user.service.impl;

import com.neusoft.project.storage.user.domain.User;
import com.neusoft.project.storage.user.mapper.UserMapper;
import com.neusoft.project.storage.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryList() {
        return userMapper.queryList();
    }
}
