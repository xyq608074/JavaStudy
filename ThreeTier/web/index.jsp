<%@ page import="java.util.List" %>
<%@ page import="com.threetier.domain.Message" %><%--
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
    <form action="/msgadd" method="post">
        name: <input type="text" name="name"><br>
        message: <input type="text" name="message"><br>
        <input type="submit" value="发送">
    </form>
    <ul>
        <%
            List<Message> messagelist= (List<Message>) request.getAttribute("MessageList");
            for (Message msg : messagelist) {
        %>
        <li>
            name: <%=msg.getName()%>   time: <%=msg.getMsgtime()%>  <a href="/update.jsp?updateid=<%=msg.getId()%>">修改</a> | <a href="/msgdel?del=<%=msg.getId()%>">删除</a><br>
            message: <%=msg.getMessage()%>
        </li>
        <%
            }
        %>

    </ul>
  </body>
</html>
