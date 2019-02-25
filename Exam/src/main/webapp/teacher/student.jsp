<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/right.css">
</head>
<body>
    <div class="select">
        <a href="#" class="active">学生管理</a>
        <a href="#">添加学生</a>
        <form action="/teacher/classlist" method="post">
            <div class="findclass">
                选择班级 :
                <select name="thClass">
                    <option value="0"> 请选择一个班级 </option>
                    <option value="1">1班</option>
                    <option value="2">2班</option>
                    <option value="3">3班</option>
                    <option value="4">4班</option>
                </select>
                <input type="submit" value="查询">
            </div>
        </form>
    </div>

    <table>
        <tr>
            <th></th>
            <th>序号</th>
            <th>姓名</th>
            <th>成绩</th>
            <th>操作</th>
        </tr>
        <tr>
            <td class="ck">
                <input type="checkbox" name="ck">
            </td>
            <td class="num">
                1
            </td>
            <td class="name">
                张三
            </td>
            <td class="score">
                100
            </td>
            <td class="operate">
                <a href="#">修改</a>
                |
                <a href="#">删除</a>
            </td>
        </tr>
        <tr>
            <td class="ck">
                <input type="checkbox" name="ck">
            </td>
            <td class="num">
                1
            </td>
            <td class="name">
                张三
            </td>
            <td class="score">
                100
            </td>
            <td class="operate">
                <a href="#">修改</a>
                |
                <a href="#">删除</a>
            </td>
        </tr>
        <tr>
            <td class="ck">
                <input type="checkbox" name="ck">
            </td>
            <td class="num">
                1
            </td>
            <td class="name">
                张三
            </td>
            <td class="score">
                100
            </td>
            <td class="operate">
                <a href="#">修改</a>
                |
                <a href="#">删除</a>
            </td>
        </tr>
        <tr>
            <td class="ck">
                <input type="checkbox" name="ck">
            </td>
            <td class="num">
                1
            </td>
            <td class="name">
                张三
            </td>
            <td class="score">
                100
            </td>
            <td class="operate">
                <a href="#">修改</a>
                |
                <a href="#">删除</a>
            </td>
        </tr>
    </table>
</body>
</html>
