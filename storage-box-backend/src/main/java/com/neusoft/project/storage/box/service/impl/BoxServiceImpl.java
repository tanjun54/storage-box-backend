package com.neusoft.project.storage.box.service.impl;

import com.neusoft.project.storage.box.domain.Box;
import com.neusoft.project.storage.box.mapper.BoxMapper;
import com.neusoft.project.storage.box.service.IBoxService;
import com.neusoft.project.storage.boxinfo.domain.Boxinfo;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @date:2021/11/1/15:52
 * @author:谭珺
 */
@Service
@Slf4j
public class BoxServiceImpl implements IBoxService {
    private final BoxMapper boxMapper;
    @Autowired
    public BoxServiceImpl(BoxMapper boxMapper){
        this.boxMapper=boxMapper;
    }
    //查询箱子
    @Override
    public List<Box>querylist(){
        return boxMapper.queryAll();}
    @Override
    public List<Box> select(){
        return boxMapper.queryAll();
    }
    //新增箱子
    @Override
    public void insert(Box insert){
        insert.setCreateTime(new Date());
        insert.setCreateBy("admin");
        insert.setVersion(0L);
        boxMapper.insert(insert);
    }
    //删除箱子
    @Override
    public int delete(Long id){
        return boxMapper.delete(id);
    }

}
