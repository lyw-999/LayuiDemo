<%--
  Created by IntelliJ IDEA.
  User: 吕亚伟
  Date: 2021/8/3
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表格</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>
<body>
<table id="demo" lay-filter="test">
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>班级</td>
    </tr>
</table>
<script>
    $(function () {
        //1. ajax 访问 后台
        $.ajax({
            url:'/TableServlet',
            type:'GET',
            data:'',
            dataType:'JSON',
            success:function (res) {
                console.log(res);

                $.each(res.rows, function(index, value) {
                    alert.log(value.class)
                    $('table').append('<tr><td>'+value.name+'</td><td>'+value.age+'</td><td>'+value.class+'</td></tr>')
                })
            }
        });
    });
</script>
</body>
</html>
