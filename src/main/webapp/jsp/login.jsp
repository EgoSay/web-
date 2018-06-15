<%--
  Created by CodeAC
  Date: 2018/6/15
  Time: 16:13
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/user/login.action">
    <label>用户名：</label>
    <br>
    <input type="text" name="username">
    <br>
    <label>密码：</label>
    <br>
    <input type="password" name="password">
    <br>
    <input type="submit">

</form>

</body>
</html>
