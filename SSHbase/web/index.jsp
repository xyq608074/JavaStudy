<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/22
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Message</title>
  </head>
  <body>
    <form action="/msg/msgsave" method="post">
        <input type="text" name="name">
        <input type="text" name="message">
        <input type="submit" value="提交">
    </form>
    <ul>
        <li>
            name: xxxxxxxxxxx  time:xxxxxxxxxxxxxxxxxx  <a href="">修改</a> | <a href="">删除</a><br>
            message: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        </li>
    </ul>
  </body>
</html>
