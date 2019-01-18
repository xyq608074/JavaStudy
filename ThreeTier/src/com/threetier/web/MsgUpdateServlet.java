package com.threetier.web;

import com.threetier.service.MessageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "MsgUpdateServlet", urlPatterns = "/msgupdate")
public class MsgUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取修改的元素
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String message = request.getParameter("message");

        MessageService messageService = new MessageService();
        try {
            messageService.MessageUpdate(Integer.parseInt(id), name, message);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("/messageservlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
