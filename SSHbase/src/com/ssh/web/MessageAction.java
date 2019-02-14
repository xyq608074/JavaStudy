package com.ssh.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.domain.Message;
import com.ssh.service.MessageService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageAction extends ActionSupport implements ModelDriven<Message> {

    //模型驱动使用的对象
    private Message msg= new Message();
    @Override
    public Message getModel() {
        return msg;
    }

    //注入service方法
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    //执行保存方法
    public String save(){
        System.out.println("MessageAction 的 save方法执行...");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        msg.setMsgtime(sdf.format(date));
        messageService.save(msg);
        return "save";
    }
}
