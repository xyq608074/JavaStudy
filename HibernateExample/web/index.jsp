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
    <form action="/msg/msgadd" method="post">
        <input type="text" name="name">
        <input type="text" name="message">
        <input type="submit" value="提交">
    </form>
    <ul>

        <s:iterator value="list">
        <li>
            name: <s:property value="name"/>  time:<s:property value="msgtime"/>  <a href="/msg/msgfindone?update=<s:property value="id"/>">修改</a> | <a href="/msg/msgdelete?del=<s:property value="id"/>">删除</a><br>
            message: <s:property value="message"/>
        </li>
        </s:iterator>
        <s:debug></s:debug>
    </ul>
  </body>
</html>
