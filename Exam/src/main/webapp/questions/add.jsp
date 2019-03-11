<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/right.css">
    <style>
        select{
            width: 350px;
            height: 25px;
        }
        input[type="text"]{
            width: 350px;
            height: 25px;
        }
        table tr td:first-child{
            width: 100px;
        }
    </style>
</head>
<body>
<nav>
    <a href="/course/cslist">考题管理</a>
    <a href="/questions/add.jsp"  class="active">添加考题</a>
</nav>
<s:actionerror/>
<form action="/qs/add" method="post" class="add">
    <table>
        <s:select list="getcourse" name="qsCourse" listKey="courseId" listValue="courseName" label="考试科目"/>
        <tr>
            <td>考题标题 : </td>
            <td><input type="text" name="qsTitle"></td>
        </tr>
        <tr>
            <td>A 选项 : </td>
            <td><input type="text" name="qsA"></td>
        </tr>
        <tr>
            <td>B 选项 : </td>
            <td><input type="text" name="qsB"></td>
        </tr>
        <tr>
            <td>C 选项 : </td>
            <td><input type="text" name="qsC"></td>
        </tr>
        <tr>
            <td>D 选项 : </td>
            <td><input type="text" name="qsD"></td>
        </tr>
        <tr>
            <td>正确答案 : </td>
            <td><input type="text" name="qsAnswer"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="添加考题">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
