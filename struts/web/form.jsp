<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/20
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
</head>
<body>
    <h1>form提交</h1>
    <form action="${pageContext.request.contextPath}/form/form">
        姓名: <input type="text" name="name"><br>
        年龄: <input type="text" name="age"><br>
        生日: <input type="text" name="birthday"><br>
        爱好: <input type="checkbox" value="run" name="hobby">跑步
            <input type="checkbox" value="swing" name="hobby">游泳
            <input type="checkbox" value="football" name="hobby">足球
            <input type="checkbox" value="pingpangball" name="hobby">乒乓球<br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
