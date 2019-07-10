<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/6/22
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>IFilm</title>
</head>
<body>
        ${list.filmid}
        ${list.filmname}
        ${list.filmintro}
        ${list.score}
        ${list.price}
        ${list.onclick}
        <a href="${pageContext.request.contextPath}/film/view?fid=${list.filmid}">view</a>
</body>

<script>
</script>

</html>
