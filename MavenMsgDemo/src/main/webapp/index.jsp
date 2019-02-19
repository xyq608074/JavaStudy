<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <form action="/msgsave" method="post">
        <input type="text" name="name">
        <input type="text" name="message">
        <input type="submit" value="提交">
    </form>

    <ul>
        <s:iterator value="list">
        <li>
            name: <s:property value="name"/>  msgtime:<s:property value="msgtime"/> <br>
            msg:<s:property value="message"/>
            <a href="/msgdelete?id=<s:property value="id"/>">删除</a> | <a href="/msgfind?id=<s:property value="id"/>">修改</a>
        </li>
        </s:iterator>
    </ul>
</body>
</html>