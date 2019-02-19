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

    public String save(){
        System.out.println("MessageAction save");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        msg.setMsgtime(sdf.format(date));
        messageService.save(msg);
        return "save";
    }

    public String findall(){
        System.out.println("MessageAction findAll");
        List<Msg> list = messageService.findAll();
        ActionContext.getContext().put("list",list);
        return "findall";
    }

    public String find(){
        System.out.println("MessageAction find");
        List<Msg> msglist=messageService.find(msg);
        ActionContext.getContext().put("msglist",msglist);
        return "find";
    }

    public String delete(){
        System.out.println("MessageAction delete");
        messageService.delete(msg);
        return "delete";
    }

    public String update(){
        System.out.println("MessageAction update");
        messageService.update(msg);
        return "update";
    }


}
