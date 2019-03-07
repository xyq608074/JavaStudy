<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/right.css">
</head>
<body>
    <nav>
        <a href="/class/classlist">学生管理</a>
        <a href="/student/addstu"  class="active">添加学生</a>
    </nav>

    <form action="/student/add" method="post" class="add">
        <s:actionerror/>
        <table>
            <tr>
                <td>姓名 : </td>
                <td><input type="text" name="stuName"></td>
            </tr>
            <s:select label="班级" list="classlist" name="stuClass" listKey="clsId" listValue="clsName" headerKey="0" headerValue="请选择一个班级"/>
            <tr>
                <td>用户名: </td>
                <td><input type="text" name="stuUsername"></td>
            </tr>
            <tr>
                <td>密码 : </td>
                <td><input type="password" name="stuPassword"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="添加学生">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
