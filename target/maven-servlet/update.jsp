<%--
  Created by IntelliJ IDEA.
  User: 正义哥
  Date: 2020/11/10
  Time: 0:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="/update" method="post">
        <input type="hidden" name="id" value="${user.id}"><br>
        姓名<input type="text" name="name" value="${user.uname}"><br>
        性别<input type="text" name="gender" value="${user.gender}"><br>
        密码<input type="text" name="pass" value="${user.pass}"><br>
        邮箱<input type="text" name="email" value="${user.email}"><br>
        <input type="submit" value="提交">

    </form>
</div>
</body>
</html>
