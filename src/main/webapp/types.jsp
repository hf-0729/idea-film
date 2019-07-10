<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/6/20
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Types</title>
</head>
<body>

    <c:forEach items="${list}" var="t">
        <button onclick="typefilm(${t.typeid})">${t.typename}</button>
    </c:forEach>

</body>

<script>
    function typefilm(typeid) {
        var url = "${pageContext.request.contextPath}/film/filmbytype?typeid="+typeid;
        location=url;
    }
</script>

</html>
