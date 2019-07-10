<%--
  Created by IntelliJ IDEA.
  User: lenov
  Date: 2019/6/19
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Films</title>
</head>
<body>
`   <button onclick="about()">About Me</button>
    <button onclick="history()">history</button>
    <button onclick="mysc()">collection</button>
    <table>
        <tr>
            <th>NO.</th>
            <th>Name</th>
            <th>Do</th>
        </tr>
        <c:forEach items="${list}" var="f">
            <tr>
                <td>${f.filmid}</td>
                <td>${f.filmname}</td>
                <td><button onclick="show(${f.filmid})">Show</button></td>
                <td><button onclick="collection(${f.filmid})">Collection</button></td>
            </tr>
        </c:forEach>
    </table>
</body>

<script>
    function show(id) {
        location = "${pageContext.request.contextPath}/film/ifilm?fid="+id;
    }
    function about() {
        open('${pageContext.request.contextPath}/user/suser');
    }
    function history() {
        open('${pageContext.request.contextPath}/user/history');
    }
    function collection(id) {
        open('${pageContext.request.contextPath}/user/collection?fid='+id);
    }
    function mysc() {
        open('${pageContext.request.contextPath}/user/mysc');
    }
</script>

</html>

