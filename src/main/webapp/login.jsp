<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/6/18
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <meta name="referrer" content="never">
    <link rel="stylesheet"  href="${pageContext.request.contextPath}/js/webuploader-0.1.5/webuploader.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/webuploader-0.1.5/webuploader.js"></script>
</head>
<body>
    ${msg}
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        姓名：<input type="text" name="uname"><br>
        密码：<input type="password" name="ucode"/><br>
        验证码:<img src="/user/yzm"><input type="text" name="yzm"><br>
        <button type="submit">Login</button>
    </form>
</body>
</html>
