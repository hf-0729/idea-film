<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/6/20
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Film Style</title>
</head>


<body>
        <c:forEach items="${typefilm}" var="f">
            ${f.filmname}
        </c:forEach>
</body>
</html>
