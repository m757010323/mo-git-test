<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="js/jquery-3.3.1.min.js"></script>
    <script>
        var username = "zhangsan";
        var age = 23;
        var ssa = {"username":"zhangsan","age":23};

        alert(ssa);

        $(function () {
            $.ajax({
                url:"filter/test",
                type:"post",
                data:JSON.stringify(ssa),
                contentType:"application/json;charset=utf-8"
            });
        })

    </script>
</head>
<body>
<h1>helloworld</h1>


</body>
</html>
