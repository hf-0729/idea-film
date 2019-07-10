<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/6/22
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Actor</title>
</head>
<body>

    <c:forEach items="${list}" var="a">
        ${a.aid}
        ${a.aname}
        ${a.aintro}
    </c:forEach>

</body>
</html>
