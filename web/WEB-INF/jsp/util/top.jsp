<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 94708
  Date: 2018/6/22
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div style="border: black 1px">
    <div style="align-content: center">
        <h1>化妆品购物管理系统</h1>
    </div>
    <hr>
    <div style="align-content: right">
        <h3>
        <c:choose>
            <c:when test="${user!=null}">
                欢迎您！${user.shopperTelnum}
                <a href="${pageContext.request.contextPath}/shopper/logout">退出</a>
            </c:when>
            <c:otherwise>
                <a href="${pageContext.request.contextPath}/shopper/dl" >请登录</a>/<a href="${pageContext.request.contextPath}/shopper/zc" >注册</a>
            </c:otherwise>
        </c:choose>
        </h3>
        <hr>
    </div>
</div>