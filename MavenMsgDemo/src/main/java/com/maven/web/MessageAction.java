package com.maven.web;

import com.maven.domain.Msg;
import com.maven.service.MessageService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MessageAction extends ActionSupport implements ModelDriven<Msg> {

    private Msg msg=new Msg();
    @Override
    public Msg getModel() {
        return msg;
    }


    private MessageService messageService;
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    //添加所有
    public String save(){
        System.out.println("MessageAction save");

        //添加时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        msg.setMsgtime(sdf.format(date));

        messageService.save(msg);
        return "save";
    }

    //查询所有
    public String findall(){
        System.out.println("MessageAction findAll");
        //查询所有并且用list集合接收
        List<Msg> list = messageService.findAll();
        //向页面中传list集合
        ActionContext.getContext().put("list",list);
        return "findall";
    }

    //查询一条
    public String find(){
        System.out.println("MessageAction find");
        List<Msg> msglist=messageService.find(msg);
        ActionContext.getContext().put("msglist",msglist);
        return "find";
    }

    //删除
    public String delete(){
        System.out.println("MessageAction delete");
        messageService.delete(msg);
        return "delete";
    }

    //修改
    public String update(){
        System.out.println("MessageAction update");
        messageService.update(msg);
        return "update";
    }
}
