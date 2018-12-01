package cn.xiaojf.springboot.sitemesh3.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MeshsiteController {
    @RequestMapping("home")
    public String home() {
        return "home";
    }


}
