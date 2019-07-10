<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/5/11
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet"  href="${pageContext.request.contextPath}/js/webuploader-0.1.5/webuploader.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/webuploader-0.1.5/webuploader.js"></script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/add" method="post">
        姓名：<input type="text" name="uname"><br>
        密码：<input type="password" name="ucode"/><br>
        性别：<input type="radio" name="usex" value="1">男
              <input type="radio" name="usex" value="0">女<br>
        生日：<input type="date" name="ubirthday"/><br>
        照片：         <!--dom结构部分-->
        <div id="uploader-demo">
            <!--用来存放item-->
            <div id="fileList" class="uploader-list"></div>
            <div id="filePicker">选择图片</div>
        </div>
        <button>注册</button>
    </form>

    <script src="js/upload.js"></script>

</body>
</html>
