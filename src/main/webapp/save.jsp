<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <form action="${pageContext.request.contextPath}/user/save" method="post">
       姓名:<input name="username"><br>
       密码:<input name="password"><br>
       性别:<input name="gender"><br>
       生日:<input name="birthday"><br>
       <input type="submit" value="submit">
   </form>
</body>
</html>
