<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Maria
  Date: 12.01.2020
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <h1>Product list</h1>
    <c:forEach items="${products}" var="product">
        <p>${product.title}</p>
    </c:forEach>
    <h1>${product.title}</h1>
</head>
<body>

</body>
</html>
