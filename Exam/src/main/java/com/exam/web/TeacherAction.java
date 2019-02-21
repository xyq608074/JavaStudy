package com.exam.web;

import com.exam.domain.Teacher;
import com.exam.service.TeacherService;
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

    public String login(){
        teacher.setThUsername(teacher.getThUsername());
        teacher.setThPassword(teacher.getThPassword());
        if (teacherService.login(teacher)>0){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }

//        ActionContext.getContext().getSession().put()
        return "thlogin";
    }
}
