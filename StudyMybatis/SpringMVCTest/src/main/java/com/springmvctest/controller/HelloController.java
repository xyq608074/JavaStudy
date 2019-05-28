package com.springmvctest.controller;


import com.springmvctest.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器类
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("Say Hello !");
        return "success";
    }

    @RequestMapping("/user")
    public String getUser(User user){
        System.out.println(user);
        return "success";
    }
}
