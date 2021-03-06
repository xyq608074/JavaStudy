<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../web/css/base.css">
    <link rel="stylesheet" href="../web/css/questions.css">
    <script src="../web/lib/jquery-3.3.1.min.js"></script>

</head>
<body>
    <s:debug/>
    <fieldset>
        <legend>考试题目</legend>
        <s:iterator value="list">
            <input type="hidden" value="<s:property value="qsId"/>" id="qsId">
            <h3><s:property value="qsTitle"/></h3>
            <p>
                A:　<s:property value="qsA"/>
            </p>
            <p>
                B:　<s:property value="qsB"/>
            </p>
            <p>
                C:　<s:property value="qsC"/>
            </p>
            <p>
                D:　<s:property value="qsD"/>
            </p>
        </s:iterator>
        <div class="select">
            
            <span>请选择: </span>
            <button id="qsa">A</button>
            <button id="qsb">B</button>
            <button id="qsc">C</button>
            <button id="qsd">D</button>
        </div>

        <div class="questions">
            <a href="?currentPage=<s:property value="currentPage-1 < 1 ? 1 : currentPage-1"/>" class="qsnext">上一题</a>
            <a href="?currentPage=<s:property value="currentPage+1 > total ? total : currentPage+1"/>" class="qsprev">下一题</a>
        </div>
    </fieldset>

    <ul>
        <s:iterator begin="1" end="total" var="i">
            <li><a href="?currentPage=<s:property value="#i"/>"><s:property value="#i"/></a></li>
        </s:iterator>
    </ul>
    <div class="count">
        <s:property value="#session"/>
        分数是: <s:property value="#session.qscount<0 ? 0 : #session.qscount"/>
    </div>

    <script>
        $(".select>button").on("click",function(){
            $.ajax({
                url:"/qs/rightorwrong?qsAnswer="+this.innerHTML+"&qsId="+ $("#qsId").val(),
                success:function(data){
                    console.log(data);
                }
            });
        })
    </script>
</body>
</html>
