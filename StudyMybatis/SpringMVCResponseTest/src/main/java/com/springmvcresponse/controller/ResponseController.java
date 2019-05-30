package com.springmvcresponse.controller;

import com.springmvcresponse.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class ResponseController {

    /**
     * 字符串跳转
     * @param model
     * @return
     */
    @RequestMapping("/string")
    public String returnString(Model model){
        System.out.println("返回字符串...");

        User user=new User();
        user.setUsername("张三");
        user.setPassword("123");
        user.setAge(18);

        model.addAttribute("user",user);

        return "success";
    }

    /**
     * void 跳转
     * @param model
     */
    @RequestMapping("/void")
    public void returnVoid(Model model){
        System.out.println("返回void...");

        User user=new User();
        user.setUsername("李四void");
        user.setPassword("123");
        user.setAge(19);

        model.addAttribute("user",user);
    }

    /**
     * 使用ModelAndView对象方式
     * @return
     */
    @RequestMapping("/mv")
    public ModelAndView returnModelAndView(){
        ModelAndView mv=new ModelAndView();

        User user=new User();
        user.setUsername("李四ModelAndView");
        user.setPassword("123");
        user.setAge(19);

        mv.addObject("user",user);

        mv.setViewName("success");

        return mv;
    }

    /**;
     * 转发
     * @return
     */
    @RequestMapping("/forward")
    public String returnForward(){
        return "forward:/WEB-INF/pages/success.jsp";
    }

    /**
     * 重定向
     * @return
     */
    @RequestMapping("/redirect")
    public String returnredirect(){
        return "redirect:/index.jsp";
    }

    /**
     * ajax
     */
    @RequestMapping("/returnajax")
    public void returnajax(@RequestBody String body){
        System.out.println("执行了ajax...");
        System.out.println(body);
    }

    /**
     * ajax 传对象
     * @return
     */
    @RequestMapping("/objajax")
    public @ResponseBody User returnObjAjax(@RequestBody User user){
        System.out.println("执行了objajax传对象...");
        System.out.println(user);

//        user.setUsername("张三objAjax");
//        user.setAge(80);

        return user;
    }
}
