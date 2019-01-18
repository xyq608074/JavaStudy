package com.threetier.web;

import com.threetier.service.MessageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "MsgDelServlet",urlPatterns = "/msgdel")
public class MsgDelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得get的del的文本id
        int del = Integer.parseInt(request.getParameter("del"));
        //删除传递到service
        MessageService messageService = new MessageService();
        try {
            messageService.MessageDel(del);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("messageservlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
