<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <script src="js/vue.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/axios.js" type="text/javascript" charset="UTF-8"></script>

    <style>
        #select{
            width: 200px;
            height: 50px;
            display: flex;
            border: 1px solid saddlebrown;
        }
        .input{
            width: 150px;
            border: 1px solid sandybrown;
        }
        .search{
            flex-grow: 1;
            height: 100%;
            border: 1px solid slategray;
        }
    </style>

</head>

<body>
<h2>Welcome to My Film World!</h2>
<h3 onclick="go(1)">All films</h3>
<h3 onclick="go(2)">Login</h3>
<h3 onclick="go(3)">Regist</h3>
<h3 onclick="go(4)">Onclick</h3>
<form action="${pageContext.request.contextPath}/search/likesearch" method="post">
    <div id="select">
            <div class="input"><input type="text" style="width: 100%;height: 100%" name="s"/></div>
            <div><button class="search" type="submit" style="width: 100%;height: 100%; border-style:none ;">Search</button></div>
    </div>
</form>
</body>

<script>
    function go(x) {
        var index = x;
        if (index == 1){
            location = "${pageContext.request.contextPath}/film/findallfilm";
        } else if (index == 2){
            location = "${pageContext.request.contextPath}/login.jsp";
        } else if (index == 3){
            location = "${pageContext.request.contextPath}/regist.jsp";
        } else if (index == 4){
            location = "${pageContext.request.contextPath}/film/click";
        }
    }
</script>

</html>
