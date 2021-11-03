package com.neusoft.project.storage.box.service;

import com.neusoft.project.storage.box.domain.Box;

import java.util.List;

/**
 * @Description:
 * @date:2021/11/1/15:52
 * @author:谭珺
 */
public interface IBoxService {
    //查询箱子
    List<Box> querylist();

    List<Box> select();
    //新增箱子
    void insert(Box boxStandard);
    //删除箱子
    int delete(Long id);
}
