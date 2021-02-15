<%@ page import="org.springframework.ui.Model" %>
<%@ page import="com.example.demo.models.User" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2/4/2021
  Time: 5:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://thymeleaf.org">
<head>
    <title>Title</title>
</head>
<body>
    <p th:text="${user.get_id()}">VALUE</p>
    <p th:text="${user.getUsername()}">VALUE</p>
</body>
</html>
