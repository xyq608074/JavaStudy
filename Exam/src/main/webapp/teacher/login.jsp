<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/login.css">
</head>
<body>
    <%@ include file="../head.jsp"%>
    <form action="/teacher/login" method="post">
        <div class="input">
            <h1>教师登陆</h1>
            <s:actionerror/>
            <input type="text" name="thUsername" placeholder="请输入用户名">
            <input type="password" name="thPassword" placeholder="请输入密码">
            <input type="submit" value="登录">
        </div>
    </form>
</body>
</html>
