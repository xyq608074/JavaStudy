package com.exam.web;

import com.exam.domain.Student;
import com.exam.domain.Teacher;
import com.exam.service.StudentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.dispatcher.Parameter;

import java.util.List;

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
        Student stulogin = studentService.login(student);

        if (stulogin!=null){
            ActionContext.getContext().getSession().put("stulogin",stulogin);
            return "logingin";
        }else{
            this.addActionError("账号或密码错误!");
            return "login";
        }
    }

    //添加学生UI
    public String addstu(){
        ClazzAction.getclazz();
        return "addstu";
    }

    //添加功能
    public String add(){
        int add = studentService.add(student);
        if (add>0){
            return "add";
        }
        this.addActionError("插入失败");
        return "adderror";
    }

    //删除
    public String delete(){
        studentService.delete(student);
        return "delete";
    }


    //学生列表 根据班级
    public String stulist(){
        Parameter stuclass = ActionContext.getContext().getParameters().get("thClass");
        //判断是否直接点击选择班级 直接选择班级
        if ("0".equals(stuclass.getValue())){
            return "stulist";
        }
        List<Student> studentlistclass = studentService.findAllByClass(stuclass);
        ActionContext.getContext().put("studentlistclass",studentlistclass);

        Teacher thlogin = (Teacher) ActionContext.getContext().getSession().get("thlogin");

        ClazzAction.getclazz();
        return "stulist";
    }

    //查询一条 修改用
    public String findid(){
        List<Student> findid = studentService.findid(student);
        ActionContext.getContext().put("findid",findid);
        ClazzAction.getclazz();
        return "findid";
    }

    //修改
    public String update(){
        studentService.update(student);
        ClazzAction.getclazz();
        return "stulist";
    }
}
