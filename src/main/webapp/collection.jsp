<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/7/2
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>My Collection</title>
</head>
<body>
    <c:forEach items="${musc}" var="c">
        <c:forEach items="${c.value}" var="co">
            ${co.uid}
            ${co.fid}
            ${co.fname}
        </c:forEach>
    </c:forEach>
</body>
</html>
