package com.exam.web;

import com.exam.domain.Clazz;
import com.exam.domain.Teacher;
import com.exam.service.ClazzService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;


public class ClazzAction extends ActionSupport implements ModelDriven<Clazz> {

    private Clazz clazz=new Clazz();
    @Override
    public Clazz getModel() {
        return clazz;
    }

    private static ClazzService clazzService;

    public void setClazzService(ClazzService clazzService) {
        this.clazzService = clazzService;
    }

    //班级列表
    public String classlist(){
        this.getclazz();
        return "classlist";
    }

    //获取当前教师所教的班级
    public static void getclazz(){
        //获取当前老师登陆信息
        Teacher thlogin = (Teacher) ActionContext.getContext().getSession().get("thlogin");
        //获取老师所带班级
        String clazz = thlogin.getThClass();
        List<Clazz> classlist =clazzService.classList(clazz);
        //得到班级信息后传给前台页面
        ActionContext.getContext().put("classlist", classlist);
    }

}
