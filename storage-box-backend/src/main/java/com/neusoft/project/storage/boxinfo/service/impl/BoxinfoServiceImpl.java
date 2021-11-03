package com.neusoft.project.storage.boxinfo.service.impl;

import com.neusoft.project.storage.box.domain.Box;
import com.neusoft.project.storage.boxinfo.domain.Boxinfo;
import com.neusoft.project.storage.boxinfo.mapper.BoxinfoMapper;
import com.neusoft.project.storage.boxinfo.service.IBoxinfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @date:2021/11/2/10:47
 * @author:谭珺
 */
@Service
@Slf4j
public class BoxinfoServiceImpl implements IBoxinfoService {
    private final BoxinfoMapper boxinfoMapper;

    @Autowired
    public BoxinfoServiceImpl(BoxinfoMapper boxinfoMapper) {
        this.boxinfoMapper = boxinfoMapper;
    }

    //查询箱子
    @Override
    public List<Boxinfo> querylist() {
        return boxinfoMapper.queryALL();
    }

    //新增箱子
    public void add(Boxinfo add){
        add.setCreateTime(new Date());
        add.setCreateBy("admin");
        add.setVersion(0L);
        Date date = new Date();
        long time = date.getTime();
        add.setBoxCode(time);
        add.setIsUsed(0L);

       boxinfoMapper.add(add);
    }
    //删除箱子
    @Override
    public int delete(Long id) {
        return boxinfoMapper.delete(id);
    }
}
