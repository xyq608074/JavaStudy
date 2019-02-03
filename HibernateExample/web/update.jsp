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
    <form action="/msg/msgupdate" method="post">
        <s:iterator value="#list">
        <input type="hidden" name="id" value="<s:property value="id"/>">
        <input type="text" name="name" value="<s:property value="name"/>">
        <input type="text" name="message" value="<s:property value="message"/>">
        </s:iterator>
        <input type="submit" value="提交">
    </form>
  </body>
</html>
