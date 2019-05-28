package com.springmvc.controller;

import com.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    /**
     * 普通传值
     * @return
     */
    @RequestMapping("/say")
    public String sayHello(){
        System.out.println("Hello !");
        return "success";
    }

    /**
     * 对象传值
     * @param user
     * @return
     */
    @RequestMapping("/obj")
    public String obj(User user){
        System.out.println(user);
        return "success";
    }
}
