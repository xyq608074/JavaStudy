package com.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/anno")
public class AnnoController {

    /**
     * RequestParam
     * 如果形参的参数和传过来的参数不一致时使用
     * @param name
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("username") String name){
        System.out.println("执行了RequestParam...");
        System.out.println(name);
        return "success";
    }

    /**
     * RequestBody
     * 获得提交过来的所有信息
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了RequestBody...");
        System.out.println(body);
        return "success";
    }


    /**
     * 可以使用  http://localhost:8080/anno/testPathVariable/10  模式来传值
     * 和 PHP中的 TP框架类似
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable("sid") String id){
        System.out.println("执行PathVariable...");
        System.out.println(id);
        return "success";
    }


    /**
     * 获取请求头
     * @param header
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("User-Agent") String header){
        System.out.println("执行RequestHeader...");
        System.out.println(header);
        return "success";
    }


    /**
     * 获得cookie
     * @param cookie
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String cookie){
        System.out.println("执行CookieValue...");
        System.out.println(cookie);
        return "success";
    }
}
