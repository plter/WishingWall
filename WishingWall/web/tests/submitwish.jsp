<%--
  Created by IntelliJ IDEA.
  User: plter
  Date: 6/17/15
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交愿望</title>
</head>
<body>
<form action="<%out.print(request.getContextPath());%>/addwish" method="post">
    <span>许愿者：</span><input type="text" name="name"><br>
    <span>愿望：</span><input type="text" name="content"><br>
    <input type="submit">
</form>
</body>
</html>
