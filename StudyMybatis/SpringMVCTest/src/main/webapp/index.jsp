<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="hello">链接</a>

    <form action="/user" method="post">
        姓名:<input type="text" name="userName"><br>
        地址:<input type="text" name="userAddr"><br>
        性别:<input type="text" name="userSex"><br>
        生日:<input type="text" name="userBirthday"><br>
        存款:<input type="text" name="acc.accMoney"><br>
        <input type="submit" value="提交">
    </form>

    <br><br><br><br><br>
    <h1>AnnoController:</h1><br>

    <h3>RequestParam</h3>
    <a href="anno/testRequestParam?username=哈哈">RequestParam</a>

    <h3>RequestBody</h3>
    <form action="/anno/testRequestBody" method="post">
        姓名:<input type="text" name="name"><br>
        年龄:<input type="text" name="age"><br>
        <input type="submit" value="提交">
    </form>

    <h3>PathVariable</h3>
    <a href="anno/testPathVariable/10">PathVariable</a>

    <h3>RequestHeader</h3>
    <a href="anno/testRequestHeader">RequestHeader</a>

    <h3>CookieValue</h3>
    <a href="anno/testCookieValue">CookieValue</a>
</body>
</html>
