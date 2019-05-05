<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/stuloginin" method="post">
    <div class="input">
        <h1>学生登陆</h1>
        <input type="text" name="stuUsername" placeholder="请输入用户名">
        <input type="password" name="stuPassword" placeholder="请输入密码">
        <input type="submit" value="登录">
    </div>
</form>
</body>
</html>
