package com.neusoft.project.storage.boxinfo.mapper;


import com.neusoft.project.storage.boxinfo.domain.Boxinfo;

import java.util.List;

/**
 * @Description:
 * @date:2021/11/2/10:48
 * @author:谭珺
 */
public interface BoxinfoMapper {
    //查询箱子
    List<Boxinfo> querylist();

    List<Boxinfo> queryALL();

    //删除箱子
    int delete(Long id);

    //新增箱子
    void add(Boxinfo add);
}
