package com.neusoft.project.storage.user.mapper;

import com.neusoft.project.storage.user.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> queryList();

    List<User> queryAll();
    //不需要返回id
    //新增用户
    void incon(User a);
    //删除用户
    int delete(Long userId);





}
