<%--
  Created by IntelliJ IDEA.
  User: AdminLi
  Date: 2018/12/24
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hahaha</h1>
<h1>Hahaha</h1>
<h1>Hahaha</h1>
${name}
<hr/>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    username:<input type="text" name="username"/>
    <input type="submit" value="login"/>
</form>
</body>
</html>
