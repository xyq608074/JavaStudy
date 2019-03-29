<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/left.css">
</head>
<body>
    <div class="user">
        欢迎: <s:property value="#session.stulogin.stuName"/> 同学登录
    </div>
    <hr width="80%">
    <ul>
        <li><a href="/qs/examing" target="right">开始考试</a></li>
        <li><a href="#" target="right">考试成绩</a></li>
    </ul>
</body>
</html>
