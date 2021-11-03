package com.neusoft.project.storage.user.controller;

import com.neusoft.framework.web.controller.BaseController;
import com.neusoft.framework.web.domain.AjaxResult;
import com.neusoft.framework.web.page.TableDataInfo;
import com.neusoft.project.storage.user.domain.User;
import com.neusoft.project.storage.user.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend/user")
public class UserController extends BaseController {
    @Autowired
    private IUserService userService;
    @GetMapping("/list")
    public TableDataInfo list(){
        startPage();
       // 调用service
        List<User> list = userService.queryList();
        return getDataTable(list);
    }
    //新增用户
    @PostMapping("/create")
    public AjaxResult add(@RequestBody User userName){
        logger.info("user:{}", userName);
        userService.incon(userName);
        return toAjax(1);
    }
    //删除用户
    @DeleteMapping("delete/{userId}")
    public AjaxResult delete(@PathVariable Long userId){
        userService.delete(userId);
        return toAjax(userId);
    }
}


