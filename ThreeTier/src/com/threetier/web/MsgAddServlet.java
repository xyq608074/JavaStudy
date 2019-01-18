package com.threetier.web;

import com.threetier.service.MessageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "MsgAddServlet",urlPatterns = "/msgadd")
public class MsgAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String message = request.getParameter("message");

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String msgtime= simpleDateFormat.format(date);

        MessageService messageService = new MessageService();
        try {
            messageService.MessageAdd(name,message,msgtime);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("messageservlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
