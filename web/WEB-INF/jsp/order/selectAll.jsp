<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>购物车</title>
  </head>
  <body>
  <div style="text-align: center">

      <%@include file="../util/top.jsp"%>
      <%@include file="../util/top2.jsp"%>

		  <c:forEach items="${tblOrders}" var="tblOrder" varStatus="n">
			  序号：${n.index+1}
              商品名: ${tblOrder.tblGoods.goodsName}<br>
              商品添加时间：<fmt:formatDate type="both"
                              dateStyle="long" timeStyle="long"
                              value="${tblOrder.orderTime}" />
              <form action="${pageContext.request.contextPath}/order/update" method="post">
                  商品数量: <input type="text" name="goodsNumber" placeholder="${tblOrder.goodsNumber}" size="10">
              <input type="hidden" name="orderId" value="${tblOrder.orderId}">
              <input type="submit" value="修改数量">
                  <a href="${pageContext.request.contextPath}/order/delete?orderId=${tblOrder.orderId}">删除订单</a>
              </form>
              <hr>
		  </c:forEach>

  </div>

  </body>
</html>
