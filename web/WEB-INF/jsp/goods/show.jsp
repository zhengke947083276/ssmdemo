<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 94708
  Date: 2018/6/21
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" rel="stylesheet">

</head>
<body >

    <div class="all" style="text-align: center">
        <%@include file="../util/top.jsp"%>
        <%@include file="../util/top2.jsp"%>

        <form action="${pageContext.request.contextPath}/tblGoods/selectByName" method="post">
            <input type="text" name="goodsName">
            <input type="submit" value="查询">
        </form>


        <form action="${pageContext.request.contextPath}/tblGoods/selectByType" method="post">
            化妆品类型: <select name="goodstypeId">
            <option >--请选择类型--</option>
            <c:forEach items="${goodstypes}" var="goodstype">
                <c:choose>
                    <c:when test="${goodstype.goodstypeId==id}">
                        <option value="${goodstype.goodstypeId }" selected="selected" name="goodstypeId">${goodstype.goodstypeName }</option>
                    </c:when>
                    <c:otherwise>
                        <option value="${goodstype.goodstypeId }" name="goodstypeId">${goodstype.goodstypeName }</option>
                    </c:otherwise>
                </c:choose>
            </c:forEach>

        </select>
            <input type="submit" value="提交">
        </form>

        <c:forEach items="${pageInfo.list}" var="tblGood" >
            商品名：${tblGood.goodsName}||商品数量：${tblGood.goodsNumber}||商品价格：${tblGood.goodsPrice}
            <form action="${pageContext.request.contextPath}/order/add" method="post">
                <input type="hidden" name="goodsId" value="${tblGood.goodsId}">
                <input type="hidden" name="shopperId" value="${user.shopperId}">
                <input type="hidden" name="goodsName" value="${tblGood.goodsName}">
                <input type="submit" value="加入购物车"><hr>
            </form>
        </c:forEach>

    </div>




    <div style="text-align:center">
        <ul class="pagination">
            <li class="previous"><a href="${pageContext.request.contextPath}/tblGoods/selectAll?pn=1">首  页</a></li>
            <c:if test="${pageInfo.hasPreviousPage}">
                <li><a href="${pageContext.request.contextPath}/tblGoods/selectAll?pn=${pageInfo.pageNum-1}">&laquo;</a></li>
            </c:if>
            <c:forEach items="${pageInfo.navigatepageNums}" var="page_Num">
                <c:if test="${page_Num== pageInfo.pageNum}">
                    <%--高量--%>
                    <li class="active"><a href="${pageContext.request.contextPath}/tblGoods/selectAll?pn=${page_Num}">${page_Num}</a></li>
                </c:if>
                <c:if test="${page_Num != pageInfo.pageNum}">
                    <li><a href="${pageContext.request.contextPath}/tblGoods/selectAll?pn=${page_Num}">${page_Num}</a></li>
                </c:if>
            </c:forEach>
            <c:if test="${pageInfo.hasNextPage}">
                <li><a href="${pageContext.request.contextPath}/tblGoods/selectAll?pn=${pageInfo.pageNum+1}">&raquo;</a></li>
            </c:if>
            <li class="next"><a href="${pageContext.request.contextPath}/tblGoods/selectAll?pn=${pageInfo.pages}">末  页</a></li>
        </ul>
        <br>
        <span>当前${pageInfo.pageNum}页 | 总${pageInfo.pages}页 | 总${pageInfo.total}条记录 |</span>
    </div>
</body>
</html>
