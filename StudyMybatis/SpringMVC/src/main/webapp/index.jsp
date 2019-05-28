<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>基本访问</h1>
    <a href="/hello/say">sayHello</a><br>
    <h1>对象传值</h1>
    <form action="/hello/obj" method="post">
        姓名: <input type="text" name="name"><br>
        年龄: <input type="text" name="age"><br>
        地址: <input type="text" name="addr"><br>
        <input type="submit" value="提交">
    </form><br>

    <h1>RequestParam</h1>
    <a href="/anno/testRequestParam?username=张三">RequestParam</a>


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
