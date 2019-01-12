package com.kuanquan.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://www.cnblogs.com/wmyskxz/p/9010832.html
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot fly 热部署\n " +
                "元日   \n " +
                "爆竹声中一岁除，\n " +
                "春风送暖入屠苏，  \n  " +
                "千门万户曈曈日，  \n  " +
                "总把新桃换旧符 ";
    }

}
