<%--
  Created by IntelliJ IDEA.
  User: 舒露
  Date: 2018/6/19
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/file.action" method="post" enctype="multipart/form-data">
    <input type="file" name="file1">
    <input type="submit" value="确认">
</form>
</body>
</html>
