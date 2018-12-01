package cn.xiaojf.springboot.mybatisplus.web.controller;

import cn.xiaojf.springboot.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findByUserName")
    public void findByUserName(String name) {
        userService.findByUserName(name);
    }

    @RequestMapping("/findUserAddrByName")
    public void findUserAddrByName(String name) {
        userService.findUserAddrByName(name);
    }
}
