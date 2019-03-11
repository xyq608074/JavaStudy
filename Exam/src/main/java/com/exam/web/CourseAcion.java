package com.exam.web;

import com.exam.domain.Course;
import com.exam.service.CourseService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

public class CourseAcion extends ActionSupport implements ModelDriven<Course> {

    private Course course=new Course();
    @Override
    public Course getModel() {
        return course;
    }

    private static CourseService courseService;

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    //查询所有课程
    public String courselist(){
        this.getcourse();
        return "courselist";
    }

    //获得所有课程
    public static void getcourse(){
        List<Course> getcourse = courseService.select();
        ActionContext.getContext().put("getcourse",getcourse);
    }

    //添加学科
    public String add(){
        int add = courseService.add(course);
        System.out.println("add->"+add);
        if (add>0){
            return "add";
        }
        this.addActionError("添加课程失败");
        return "adderror";
    }

    //查询一条 修改使用
    public String findid(){
        Course findid = courseService.findid(course);
        ActionContext.getContext().put("findid",findid);
        return "findid";
    }
    //修改
    public String update(){
        courseService.update(course);
        return "update";
    }

    //删除
    public String delete(){
        courseService.delete(course);
        return "delete";
    }

    //使用在下拉列表
    public String cslist(){
        this.getcourse();
        return "qslist";
    }
}
