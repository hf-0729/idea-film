<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/6/25
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
    <script src="js/vue.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/axios.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/jquery.min.js" type="text/javascript" charset="UTF-8"></script>
</head>

<style>
    #id {
        width: 200px;
        height: 200px;
        background-color: #00a2d4;
        text-align: center;
    }
</style>

<body>
<div onclick="go()">
    <embed src="${f.src}" allowFullScreen="true" quality="high" width="480" height="350"
           align="middle" allowScriptAccess="always" type="application/x-shockwave-flash">
    </embed>
</div>

<div id = "login" style="display: none">
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        姓名：<input type="text" name="uname"><br>
        密码：<input type="password" name="ucode"/><br>
        验证码:<img src="/user/yzm"><input type="text" name="yzm"><br>
        <button type="submit">Login</button>
    </form>
</div>

</body>

<script>


    var url = '${pageContext.request.contextPath}/user/uu';
    axios.get(url).then(function (result) {
        alert(result);
    });
</script>

</html>
