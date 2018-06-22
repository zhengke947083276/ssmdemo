<%--
  Created by IntelliJ IDEA.
  User: 94708
  Date: 2018/6/22
  Time: 20:24
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
    <form action="${pageContext.request.contextPath}/address/update">
        原地址：${tblAddress.addressName}<br>
        新地址：<input type="text" name="addressName">
        <input type="hidden" name="addressId" value="${tblAddress.addressId}">
        <input type="submit" value="修改">
    </form>
</div>
</body>
</html>
