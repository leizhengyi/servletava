<%--
  Created by IntelliJ IDEA.
  User: 正义哥
  Date: 2020/11/9
  Time: 20:09
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
            <table border="1">
                <tr>
                    <th>编号</th>
                    <th>性别</th>
                    <th>密码</th>
                    <th>姓名</th>
                    <th>邮编地址</th>
                    <th>操作</th>
                </tr>
                <c:forEach var="user" items="${user}">
                    <tr>
                        <td>${user.uid}</td>
                        <td>${user.gender}</td>
                        <td>${user.pass}</td>
                        <td>${user.uname}</td>
                        <td>${user.email}</td>
                        <td>
                            <a href="/selectById?id=${user.id}">修改</a>
                            <a href="">删除</a>
                            <a href="">新增</a>
                            <a href="">查询</a>
                        </td>

                    </tr>
                </c:forEach>
            </table>
        </div>

</body>
</html>
