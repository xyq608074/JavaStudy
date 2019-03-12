<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/right.css">
</head>
<body>
    <nav>
        <a href="/class/classlist" class="active">学生管理</a>
        <a href="/student/addstu">添加学生</a>
    </nav>
    <div class="select">
        <form action="/student/stulist" method="post">
            <div class="findclass">
                选择班级 :
                <s:select list="classlist" name="thClass" listKey="clsId" listValue="clsName" headerKey="0" headerValue="请选择一个班级"/>
                <input type="submit" value="查询">
            </div>
        </form>
    </div>

    <table>
        <tr>
            <th class="ck"></th>
            <th class="num">序号</th>
            <th>姓名</th>
            <th>成绩</th>
            <th>操作</th>
        </tr>
        <s:if test="studentlistclass">
            <s:iterator value="studentlistclass" status="clsstulist">
                <tr>
                    <td class="ck">
                        <input type="checkbox" name="ck" <s:property value="stuId"/>>
                    </td>
                    <td class="num">
                        <s:property value="#clsstulist.index+1"/>
                    </td>
                    <td class="name">
                        <s:property value="stuName"/>
                    </td>
                    <td class="score">
                        100
                    </td>
                    <td class="operate">
                        <a href="/student/findid?stuId=<s:property value="stuId"/>">修改</a>
                        |
                        <a href="/student/delete?stuId=<s:property value="stuId"/>&thClass=<s:property value="stuClass"/>">删除</a>
                    </td>
                </tr>
            </s:iterator>
        </s:if>
        <s:else>
            <tr>
                <td colspan="5">
                    该班级没有信息或者没有选择班级...
                </td>
            </tr>
        </s:else>
    </table>
</body>
</html>
