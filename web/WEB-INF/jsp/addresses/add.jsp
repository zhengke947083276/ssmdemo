<%--
  Created by IntelliJ IDEA.
  User: 94708
  Date: 2018/6/22
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div style="text-align: center">
<%@include file="../util/top.jsp"%>
<%@include file="../util/top2.jsp"%>
    <form action="${pageContext.request.contextPath}/address/add" method="post">
        地址：<input type="text" name="addressName">
        <input type="submit" value="添加">
    </form>
</div>
</body>
</html>
