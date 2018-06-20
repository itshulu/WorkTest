<%--suppress ALL --%>

<%--
  Created by IntelliJ IDEA.
  User: 舒露
  Date: 2018/6/19
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>下载列表</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>文件名</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${fileName}" var="fileName" varStatus="v">
        <tr>
            <td>${v.count}</td>
            <td>${fileName}</td>
            <td>
                <c:url var="url" value="down_down">
                    <%--suppress CheckTagEmptyBody --%>
                    <c:param name="fileName" value="${fileName}">下载</c:param>
                </c:url>
                <a href="${url}">下载</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
