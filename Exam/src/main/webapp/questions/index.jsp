<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/right.css">
</head>
<body>
<nav>
    <a href="/course/cslist" class="active">考题管理</a>
        <a href="/qs/addui?qsCourse=<s:property value="qsCourse"/>">添加考题</a>
</nav>
<div class="select">
        <form action="../qs/select" method="post">
        <div class="findclass">
            选择学科 :
            <s:select list="getcourse" name="qsCourse" listKey="courseId" listValue="courseName" headerKey="0" headerValue="请选择一个科目"/>
            <input type="submit" value="查询">
        </div>
    </form>
</div>

<table>
    <tr>
        <th class="ck"></th>
        <th class="num">序号</th>
        <th width="400px">考题</th>
        <th>答案A</th>
        <th>答案B</th>
        <th>答案C</th>
        <th>答案D</th>
        <th>正确答案</th>
        <th class="operate">操作</th>
    </tr>
    <s:if test="qslist">
        <s:iterator value="qslist">
            <tr>
                <td>
                    <input type="checkbox" name="ck" value="<s:property value="qsId"/>">
                </td>
                <td class="num">
                    <s:property value="qsId"/>
                </td>
                <td title="<s:property value="qsTitle"/>" width="400px" style="text-align: left">
                    <s:property value="qsTitle"/>
                </td>
                <td title="<s:property value="qsA"/>">
                    <s:property value="qsA"/>
                </td>
                <td title="<s:property value="qsB"/>">
                    <s:property value="qsB"/>
                </td>
                <td title="<s:property value="qsC"/>">
                    <s:property value="qsC"/>
                </td>
                <td title="<s:property value="qsD"/>">
                    <s:property value="qsD"/>
                </td>
                <td>
                    <s:property value="qsAnswer"/>
                </td>
                <td class="operate">
                    <a href="/qs/findid?qsId=<s:property value="qsId"/>">修改</a>
                    |
                    <a href="/qs/delete?qsId=<s:property value="qsId"/>" onclick="return confirm('真的要删除吗?')">删除</a>
                </td>
            </tr>
        </s:iterator>
    </s:if>
    <s:else>
        <tr>
            <td colspan="9">
                没有该科目考题信息...
            </td>
        </tr>
    </s:else>
</table>
</body>
</html>
