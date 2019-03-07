<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/left.css">
</head>
<body>
    <div class="user">
        欢迎: <s:property value="#session.thlogin.thName"/> 登录
    </div>
    <hr width="80%">
    <ul>
        <li><a href="/class/classlist" target="right">学生管理</a></li>
    </ul>
</body>
</html>
