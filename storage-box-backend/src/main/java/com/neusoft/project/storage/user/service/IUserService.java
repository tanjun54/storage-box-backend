package com.neusoft.project.storage.user.service;

import com.neusoft.project.storage.user.domain.User;

import java.util.List;

public interface IUserService {
    //不需要返回id
    //新增用户
    void incon(User queryList);
    //删除用户
    int delete(Long userId);


    List<User> queryList();
}
