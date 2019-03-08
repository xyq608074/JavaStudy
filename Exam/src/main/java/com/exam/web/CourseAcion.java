package com.exam.web;

import com.exam.domain.Course;
import com.exam.service.CourseService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.dispatcher.Parameter;

import java.util.List;

public class CourseAcion extends ActionSupport implements ModelDriven<Course> {

    private Course course=new Course();
    @Override
    public Course getModel() {
        return course;
    }

    private CourseService courseService;

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    //查询所有课程
    public String courselist(){
        List<Course> courseList = courseService.select();
        ActionContext.getContext().put("courselist",courseList);
        return "courselist";
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
}
