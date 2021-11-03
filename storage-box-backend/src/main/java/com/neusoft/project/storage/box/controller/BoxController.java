package com.neusoft.project.storage.box.controller;

import com.neusoft.framework.web.controller.BaseController;
import com.neusoft.framework.web.domain.AjaxResult;
import com.neusoft.framework.web.page.TableDataInfo;
import com.neusoft.project.storage.box.domain.Box;
import com.neusoft.project.storage.box.service.IBoxService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @date:2021/11/1/15:53
 * @author:谭珺
 */
@RestController
@RequestMapping("/backend/box/standard")
public class BoxController extends BaseController {
    @Autowired
    private IBoxService boxService;
    //查询箱子
    @GetMapping("/list")
    public TableDataInfo list() {
        startPage();
        List<Box> list = boxService.querylist();
        return getDataTable(list);
    }
    @GetMapping("/select")
    public TableDataInfo select() {
        startPage();
        List<Box> select = boxService.querylist();
        return getDataTable(select);
    }
    //新增箱子
    @PostMapping("/create")
    public AjaxResult  add(@RequestBody Box boxStandard){
        logger.info("Box:{}",boxStandard);
        boxService.insert(boxStandard);
        return toAjax(1);
    }
    //删除箱子
    @DeleteMapping("/delete/{id}")
    public AjaxResult delete(@PathVariable Long id){
        boxService.delete(id);
        return toAjax(id);
    }
}
