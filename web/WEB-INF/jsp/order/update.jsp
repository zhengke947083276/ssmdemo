<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>购物车</title>
  </head>
  <body>
  <div>
	  <fieldset style="border-color: green;padding: 10px;width: 50%">
		  <legend style="color: brown; font-size: 30px;font-family:黑体">修 改 商 品</legend>
			 <form action="${pageContext.request.contextPath}/OrderController/selectAll"  >
                 商品数量：<input type="text" name="goodsNumber" >
                 <input type="submit" value="确认修改"  >
             </form>
	  </fieldset>
  </div>
  </body>
</html>
