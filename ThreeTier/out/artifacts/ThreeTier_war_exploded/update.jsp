<%@ page import="java.util.List" %>
<%@ page import="com.threetier.domain.Message" %>
<%@ page import="com.threetier.service.MessageService" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/16
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
      String updateid = request.getParameter("updateid");
      MessageService messageService = new MessageService();
      List<Message> messages = messageService.findMessage(Integer.parseInt(updateid));
      
      for (Message msg: messages) {
  %>
    <form action="/msgupdate" method="post">
        <input type="hidden" name="id" value="<%=msg.getId()%>">
        name: <input type="text" name="name" value="<%=msg.getName()%>"><br>
        message: <input type="text" name="message" value="<%=msg.getMessage()%>"><br>
        <input type="submit" value="修改">
    </form>
  <%
      }
  %>
  </body>
</html>
