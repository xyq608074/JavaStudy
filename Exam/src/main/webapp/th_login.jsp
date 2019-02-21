<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="web/css/base.css">
    <link rel="stylesheet" href="web/css/login.css">
</head>
<body>
    <%@ include file="head.jsp"%>
    <form action="/thlogin" method="post">
        <div class="input">
            <h1>教师登陆</h1>
            <input type="text" name="thUsername" placeholder="请输入用户名">
            <input type="password" name="thPassword" placeholder="请输入密码">
            <input type="submit" value="登录">
        </div>
    </form>
</body>
</html>
