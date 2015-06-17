<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>提交愿望</title>
</head>
<body>
<form action="<%out.print(request.getContextPath());%>/addwish" method="post">
    <span>名字：</span><input type="text" name="name"><br>
    <span>愿望：</span><input type="text" name="content"><br>
    <input type="submit">
</form>
</body>
</html>