package com.exam.web;

import com.exam.domain.Teacher;
import com.exam.service.TeacherService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

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


    //判断登陆是否成功
    public String login(){
        Teacher thlogin = teacherService.login(teacher);

        if (thlogin!=null){
            //登陆成功
            ActionContext.getContext().getSession().put("thlogin",thlogin);
            return "logingin";
        }else{
            //登陆失败
            this.addActionError("账号或密码错误! 请确认后登录");
            return "login";
        }
    }

}
