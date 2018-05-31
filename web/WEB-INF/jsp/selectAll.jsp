<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 94708
  Date: 2018/5/31
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>查询所有</title>
  </head>
  <body>
  <h1>查询所有</h1>
  <table border="1" cellspacing="0" cellpadding="5">
    <tr>
      <td>序号</td>
      <td>姓名</td>
      <td>密码</td>
    </tr>
    <c:forEach items="${users}" var="user" varStatus="i">
      <tr>
        <td>${i.index+1}</td>
        <td>${user.user_name}</td>
        <td>${user.user_password}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
