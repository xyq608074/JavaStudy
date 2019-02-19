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
    <form action="/msgupdate" method="post">
        <s:iterator value="msglist">
            <input type="hidden" name="id" value="<s:property value="id"/>">
            <input type="text" name="name" value="<s:property value="name"/>">
            <input type="text" name="message" value="<s:property value="message"/>">
            <input type="hidden" name="msgtime" value="<s:property value="msgtime"/>">
            <input type="submit" value="修改">
        </s:iterator>
    </form>
</body>
</html>