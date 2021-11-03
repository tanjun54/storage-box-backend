package com.neusoft.project.storage.boxinfo.controller;

import com.neusoft.framework.web.controller.BaseController;
import com.neusoft.framework.web.domain.AjaxResult;
import com.neusoft.framework.web.page.TableDataInfo;
import com.neusoft.project.storage.boxinfo.domain.Boxinfo;
import com.neusoft.project.storage.boxinfo.service.IBoxinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @date:2021/11/2/10:50
 * @author:谭珺
 */
@RestController
@RequestMapping("/backend/box/info")
public class BoxinfoController extends BaseController {
    @Autowired
    private IBoxinfoService boxinfoService;
    //查询箱子
    @GetMapping("/list")
    public TableDataInfo list() {
        startPage();
        List<Boxinfo> list = boxinfoService.querylist();
        return getDataTable(list);
    }
    //新增箱子
    @PostMapping("/create")
    public AjaxResult add(@RequestBody Boxinfo boxinfo){
        logger.info("Box:{}",boxinfo);
        boxinfoService.add(boxinfo);
        return toAjax(1);
    }
    //删除箱子
    @DeleteMapping("/delete/{id}")
    public AjaxResult delete(@PathVariable Long id){
        boxinfoService.delete(id);
        return toAjax(id);
    }

}
