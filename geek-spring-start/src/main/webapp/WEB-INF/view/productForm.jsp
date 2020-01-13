<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Maria
  Date: 13.01.2020
  Time: 0:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h2>Product form</h2>
<form:form action="processProductForm" modelAttribute="product">
    <form:label path="id">
        id
    </form:label>
    <form:input path="id" />
    </p>
    <form:label path="title">
        title
    </form:label>
    <form:input path="title" />
    </p>
    <form:label path="cost">
        cost
    </form:label>
    <form:input path="cost" />
    <button type="submit">Save</button>
</form:form>
</body>
</html>

