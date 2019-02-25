package com.exam.web;

import com.exam.domain.Clazz;
import com.exam.domain.Teacher;
import com.exam.service.ClazzService;
import com.exam.service.TeacherService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

public class TeacherAction extends ActionSupport implements ModelDriven<Teacher> {

    private Teacher teacher=new Teacher();
    @Override
    public Teacher getModel() {
        return teacher;
    }


    private TeacherService teacherService;
    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public String login(){
        System.out.println("TeacherAction login");

        Teacher thlogin = teacherService.login(teacher);

        if (thlogin!=null){
            System.out.println("登录成功");
            ActionContext.getContext().getSession().put("thlogin",thlogin);
            return "logingin";
        }else{
            System.out.println("登录失败");
            this.addActionError("账号或密码错误! 请确认后登录");
            return "login";
        }
    }

    public String classlist(){
        Teacher thlogin = (Teacher) ActionContext.getContext().getSession().get("thlogin");


        String thClass = thlogin.getThClass();
        List<Clazz> classlist = teacherService.classlist(thClass);
        System.out.println(classlist.get(0));
        System.out.println(classlist.get(1));
        System.out.println(classlist.get(2));
        return "list";
    }
}
