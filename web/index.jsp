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
    <title>首页</title>
  </head>
  <body>
  <h1>添加</h1>
  <form action="/user/add" method="post">
    名字<input type="text" name="user_name"><br>
    密码<input type="text" name="user_password"><br>
    <input type="submit" value="添加">
  </form>
  </body>
</html>
