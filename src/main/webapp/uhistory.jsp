<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/7/1
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>History</title>
</head>
<body>
    <c:forEach items="${uhistory}" var="u">
        <c:forEach items="${u.value}" var="li">
            ${li.uid}
            ${li.filmname}
        </c:forEach>
    </c:forEach>
</body>
</html>
