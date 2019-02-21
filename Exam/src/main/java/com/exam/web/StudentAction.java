package com.exam.web;

import com.exam.domain.Student;
import com.exam.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport implements ModelDriven<Student> {

    private Student student=new Student();
    @Override
    public Student getModel() {
        return student;
    }

    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }


    public String login(){
        System.out.println("studentAction stulogin");
        student.setStuUsername("张三");
        studentService.login(student);
        return "stulogin";
    }
}
