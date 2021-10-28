package com.neusoft.project.storage.user.controller;


import com.neusoft.framework.web.controller.BaseController;
import com.neusoft.framework.web.page.TableDataInfo;
import com.neusoft.project.storage.user.domain.User;
import com.neusoft.project.storage.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/backend/user")
public class UserController extends BaseController {
    @Autowired
    private IUserService userService;
    @GetMapping("/list")
    public TableDataInfo list(){
        startPage();
//        调用service
        List<User> list=userService.queryList();
        return getDataTable(list);
    }
}
