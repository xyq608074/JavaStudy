<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/right.css">
</head>
<body>
<nav>
    <a href="/course/courselist" class="active">学科管理</a>
    <a href="/course/add.jsp">添加学科</a>
</nav>

<table>
    <tr>
        <th></th>
        <th>序号</th>
        <th>课程名称</th>
        <th>课程信息</th>
        <th>操作</th>
    </tr>
    <s:if test="courselist">
        <s:iterator value="courselist">
            <tr>
                <td class="ck">
                    <input type="checkbox" name="ck" value="<s:property value="courseId"/>">
                </td>
                <td class="num">
                    <s:property value="courseId"/>
                </td>
                <td>
                    <s:property value="courseName"/>
                </td>
                <td>
                    <s:property value="courseInfo"/>
                </td>
                <td class="operate">
                    <a href="/course/findid?courseId=<s:property value="courseId"/>">修改</a>
                    |
                    <a href="/course/delete?courseId=<s:property value="courseId"/>" onclick="return confirm('真的要删除吗?')">删除</a>
                </td>
            </tr>
        </s:iterator>
    </s:if>
    <s:else>
        <tr>
            <td colspan="5">
                没有查找到课程...
            </td>
        </tr>
    </s:else>
</table>
</body>
</html>
