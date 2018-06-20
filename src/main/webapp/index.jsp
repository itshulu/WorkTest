<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath }/hello.action" name="frmLogin"  method="post">
    用户名： <input type="text" name="userName"> <br/>
    密码： <input type="text" name="pwd"> <br/>
    <input type="submit" value="登陆"> <br/>
</form>
</body>
</html>
