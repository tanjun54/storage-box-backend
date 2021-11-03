package com.neusoft.project.storage.box.mapper;

import com.neusoft.project.storage.box.domain.Box;
import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.util.List;

/**
 * @Description:
 * @date:2021/11/1/15:53
 * @author:谭珺
 */
public interface BoxMapper {

    //查询箱子
    List<Box> queryAll();
    List<Box> querylist();
    //新增箱子
    void insert(Box insert);
    //删除箱子
    int delete(Long id);
}
