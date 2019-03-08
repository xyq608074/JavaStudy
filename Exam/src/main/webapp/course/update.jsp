<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/right.css">
</head>
<body>
<nav>
    <a href="/course/courselist">学生管理</a>
    <a href="/course/add.jsp"  class="active">添加学生</a>
</nav>
<form action="/course/update" method="post" class="add">
    <s:actionerror/>
    <s:iterator value="findid">
    <input type="hidden" name="courseId" value="<s:property value="courseId"/>"/>
    <table>
        <tr>
            <td>学科名称 : </td>
            <td><input type="text" name="courseName" value="<s:property value="courseName"/>"></td>
        </tr>
        <tr>
            <td>学科简介: </td>
            <td><textarea name="courseInfo"><s:property value="courseInfo"/></textarea></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="修改学科">
            </td>
        </tr>
    </table>
    </s:iterator>
</form>
</body>
</html>
