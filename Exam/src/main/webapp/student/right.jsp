<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/right.css">
</head>
<body>
    <table style="margin-top: 30px">
        <tr>
            <th>学生姓名</th>
            <th>学生账号</th>
            <th>所在班级</th>
        </tr>
        <tr>
            <td><s:property value="#session.stulogin.stuName"/></td>
            <td><s:property value="#session.stulogin.stuUsername"/></td>
            <td><s:property value="#session.stulogin.stuClass"/></td>
        </tr>
    </table>
</body>
</html>
