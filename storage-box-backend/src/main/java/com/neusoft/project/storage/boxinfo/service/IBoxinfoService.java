package com.neusoft.project.storage.boxinfo.service;

import com.neusoft.project.storage.boxinfo.domain.Boxinfo;

import java.util.List;

/**
 * @Description:
 * @date:2021/11/2/10:46
 * @author:谭珺
 */
public interface IBoxinfoService {
    //查询箱子
    List<Boxinfo> querylist();

    //删除箱子
    int delete(Long id);

    //新增
    void add(Boxinfo boxinfo);
}
