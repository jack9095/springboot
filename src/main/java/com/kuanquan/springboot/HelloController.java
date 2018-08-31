package com.kuanquan.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://www.cnblogs.com/wmyskxz/p/9010832.html
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot fly 热部署 ";
    }

}
