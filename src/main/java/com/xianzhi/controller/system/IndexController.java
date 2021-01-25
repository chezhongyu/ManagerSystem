package com.xianzhi.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create by foreknow on 2021/1/25
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping
    public String init(){
        return"/system/index";
    }

}
