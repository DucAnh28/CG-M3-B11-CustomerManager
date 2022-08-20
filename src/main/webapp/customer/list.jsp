<%--
  Created by IntelliJ IDEA.
  User: yoyo
  Date: 19/08/2022
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customer</h1>
<p>
    <a href="/customer?action=create">Create New Customer</a>
</p>
<table border="1px">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <core:forEach items="${customersList}" var="customerList">
        <tr>
            <td>${customerList.id}</td>
            <td><a href="/customer?action=view&id=${customerList.id}">${customerList.name}</a></td>
            <td>${customerList.email}</td>
            <td>${customerList.address}</td>
            <td><a href="/customer?action=edit&id=${customerList.id}">edit</a></td>
            <td><a href="/customer?action=delete&id=${customerList.id}">delete</a></td>
        </tr>
    </core:forEach>
</table>
</body>
</html>
