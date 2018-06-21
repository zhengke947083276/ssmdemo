<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/outer.js"></script>--%>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row">

                <c:forEach items="${pageInfo.list}" var="order">
                    <div class="col-md-4">
                        <div class="thumbnail">
                            <img alt="300x200" src="v3/default5.jpg" />
                            <div class="caption">
                                <h3>
                                    ${order.shopper_id}
                                </h3>
                                <p>
                                    ${order.goods_id}
                                </p>
                                <p>
                                    <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>


                <div style="text-align:center">
                    <ul class="pagination">
                        <li class="previous"><a href="${pageContext.request.contextPath}/order/selectPage?pn=1">首  页</a></li>
                        <c:if test="${pageInfo.hasPreviousPage}">
                            <li><a href="${pageContext.request.contextPath}/order/selectPage?pn=${pageInfo.pageNum-1}">&laquo;</a></li>
                        </c:if>
                        <c:forEach items="${pageInfo.navigatepageNums}" var="page_Num">
                            <c:if test="${page_Num== pageInfo.pageNum}">
                                <%--高量--%>
                                <li class="active"><a href="${pageContext.request.contextPath}/order/selectPage?pn=${page_Num}">${page_Num}</a></li>
                            </c:if>
                            <c:if test="${page_Num != pageInfo.pageNum}">
                                <li><a href="${pageContext.request.contextPath}/order/selectPage?pn=${page_Num}">${page_Num}</a></li>
                            </c:if>
                        </c:forEach>
                        <c:if test="${pageInfo.hasNextPage}">
                            <li><a href="${pageContext.request.contextPath}/order/selectPage?pn=${pageInfo.pageNum+1}">&raquo;</a></li>
                        </c:if>
                        <li class="next"><a href="${pageContext.request.contextPath}/order/selectPage?pn=${pageInfo.pages}">末  页</a></li>
                    </ul>
                    <br>
                    <span>当前${pageInfo.pageNum}页 | 总${pageInfo.pages}页 | 总${pageInfo.total}条记录 |</span>
                </div>
            </div>
    </div>
</div>
</body>
</html>
