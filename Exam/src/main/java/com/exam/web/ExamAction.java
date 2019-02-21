package com.exam.web;

import com.exam.service.ExamService;
import com.opensymphony.xwork2.ActionSupport;

public class ExamAction extends ActionSupport{

    private ExamService examService;
    public void setExamService(ExamService examService) {
        this.examService = examService;
    }

    public String test(){
        System.out.println("action");
        examService.test();
        return "test";
    }
    //显示老师登陆页面
    public String th(){
        return "thexam";
    }
    //显示学生登陆页面
    public String stu(){
        return "stuexam";
    }


}
