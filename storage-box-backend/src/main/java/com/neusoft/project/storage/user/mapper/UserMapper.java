package com.neusoft.project.storage.user.mapper;

import com.neusoft.project.storage.user.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> queryList();
}
