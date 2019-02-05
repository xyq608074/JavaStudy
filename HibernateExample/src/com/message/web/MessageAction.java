package com.message.web;

import com.message.domain.Message;
import com.message.service.MessageService;
import com.message.service.impl.MessageServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MessageAction extends ActionSupport {


    //查询
    public String find(){
        MessageService messageService = new MessageServiceImpl();
        List<Message> messages = messageService.messageSelect();

        //放到ActionContent  放到值栈中
        ActionContext.getContext().getValueStack().set("list",messages);
        return "find";
    }
    //修改
    public String findone(){
        HttpServletRequest request = ServletActionContext.getRequest();
        int update = Integer.parseInt(request.getParameter("update"));
        MessageService messageService = new MessageServiceImpl();
        List list = messageService.messageFind(update);

        ActionContext.getContext().put("list",list);
        return "findone";
    }

    public String add(){
        MessageService messageService = new MessageServiceImpl();

        HttpServletRequest request = ServletActionContext.getRequest();

        Message message = new Message();
        message.setName(request.getParameter("name"));
        message.setMessage(request.getParameter("message"));

        Date date = new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        message.setMsgtime(format);

        messageService.messageadd(message);

        return "add";
    }

    //删除
    public String delete(){
        MessageService messageService = new MessageServiceImpl();
        HttpServletRequest request = ServletActionContext.getRequest();
        int del = Integer.parseInt(request.getParameter("del"));
        messageService.del(del);
        return "delete";
    }

    //修改
    public String update(){
        MessageServiceImpl messageService = new MessageServiceImpl();
        HttpServletRequest request = ServletActionContext.getRequest();


        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String msg = request.getParameter("message");

        Message message = new Message();
        message.setId(id);
        message.setName(name);
        message.setMessage(msg);

        messageService.update(message);

        return "update";
    }

}
