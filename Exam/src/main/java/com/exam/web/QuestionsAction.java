package com.exam.web;

import com.exam.domain.Questions;
import com.exam.service.QuestionsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.components.ActionError;

import java.util.List;

public class QuestionsAction extends ActionSupport implements ModelDriven<Questions> {

    private Questions questions=new Questions();
    @Override
    public Questions getModel() {
        return questions;
    }

    private QuestionsService questionsService;

    public void setQuestionsService(QuestionsService questionsService) {
        this.questionsService = questionsService;
    }

    public String select(){
        CourseAcion.getcourse();
        String qscourse = ActionContext.getContext().getParameters().get("qsCourse").getValue();
        List<Questions> qslist = questionsService.select(qscourse);
        System.out.println("select ---->"+qslist);
        ActionContext.getContext().put("qslist",qslist);
        return "qsselect";
    }

    //添加界面
    public String addui(){
        CourseAcion.getcourse();
        return "addui";
    }

    //添加功能
    public String add(){
        Integer add = questionsService.add(questions);
        if (add>0){
            return "add";
        }
        this.addActionError("糟糕,添加失败");
        return "adderror";
    }

    //删除
    public String delete(){
        questionsService.delete(questions);
        return "delete";
    }

    //查询一条
    public String findid(){
        Questions findid = questionsService.findid(questions);
        ActionContext.getContext().put("findid",findid);
        CourseAcion.getcourse();
        return "findid";
    }

    //update
    public String update(){
        questionsService.update(questions);
        return "update";
    }
}
