package com.mygod.login.api;

import com.mygod.login.po.GmUser;
import com.mygod.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserApi {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/login2")
    @ResponseBody
    public void getList(){
        GmUser gmUser = userService.getList();
        System.out.println(gmUser);
    }
}
