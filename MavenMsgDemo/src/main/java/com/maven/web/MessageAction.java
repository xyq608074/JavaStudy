package com.maven.web;

import com.opensymphony.xwork2.ActionSupport;

public class MessageAction extends ActionSupport {
    public String save(){
        System.out.println("MessageAction save");
        return "save";
    }
}
