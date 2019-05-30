<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script>
        $(function(){
            $("#btn").click(function(){
                $.ajax({
                    url:"user/returnajax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"张三json","password":"123","age":18}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        //数据返回
                        console.log(data)
                    }
                })
            })

            $("#btn2").click(function(){
                $.ajax({
                    url:"user/objajax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"张三jsontoobj","password":"123","age":18}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        //数据返回
                        console.log(data)
                    }
                })
            })
        })
    </script>
</head>
<body>

    <a href="user/string">returnString</a><br>
    <a href="user/void">returnVoid</a><br>
    <a href="user/mv">returnMv</a><br>
    <a href="user/forward">returnforward</a><br>
    <a href="user/redirect">returnredirect</a><br>


    <button id="btn">点击实现Ajax访问json</button>
    <button id="btn2">点击实现objAjax访问json</button>

</body>
</html>
