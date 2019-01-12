package com.kuanquan.springboot.controller;

import com.kuanquan.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * https://blog.csdn.net/liaokailin/article/details/48423847
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private User user;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String sayWorld(@PathVariable("name") String name){
//        user.setName(name);
        System.out.println("userName = " + user.getName());
        System.out.println("userAge = " + user.getAge());
        System.out.println("userAge = " + user.getRemark());
        return "参数 = " + name;
    }

}
