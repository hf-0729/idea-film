<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/6/23
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>About MySelf</title>
</head>
<body>
        ${user.id}
        ${user.uname}
        ${user.ubirthday}
        ${user.usex}
        ${user.ufear}
        ${user.vip}
        <img src="${user.img}">

</body>
</html>
