<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 94708
  Date: 2018/6/22
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
<%@include file="../util/top.jsp"%>
<%@include file="../util/top2.jsp"%>
<a href="${pageContext.request.contextPath}/address/toAdd">添加收货地址</a>

<hr>
    <c:forEach items="${tblAddresses}" var="tblAddresse">
        ${tblAddresse.addressName}
        <a href="${pageContext.request.contextPath}/address/delete?addressId=${tblAddresse.addressId}">删除</a>
        <a href="${pageContext.request.contextPath}/address/toUpdate?addressId=${tblAddresse.addressId}">修改</a>
        <br>
    </c:forEach>
</div>
</body>
</html>
