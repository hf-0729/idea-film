<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/6/22
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Click</title>
</head>
<body>
<table>
    <tr>
        <th>NO.</th>
        <th>Name</th>
        <th>Click</th>
    </tr>
    <c:forEach items="${list}" var="c">
        <tr>
            <td>${c.filmid}</td>
            <td>${c.filmname}</td>
            <td>${c.onclick}W</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
