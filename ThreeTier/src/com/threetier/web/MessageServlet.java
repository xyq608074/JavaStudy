package com.threetier.web;

import com.threetier.domain.Message;
import com.threetier.service.MessageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "MessageServlet",urlPatterns = "/messageservlet")
public class MessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //传递请求到servlet
        MessageService messageService = new MessageService();
        List<Message> mlist =null;
        try {
            mlist = messageService.findAllMessage();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        //全部的Message获得了,转交给jsp
        request.setAttribute("MessageList",mlist);
        //跳转给jsp页面
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
