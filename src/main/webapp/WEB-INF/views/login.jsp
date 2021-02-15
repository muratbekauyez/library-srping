<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2/4/2021
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="/login" method="post">
        <div><label> Username : <input type="text" name="username"/> </label><br><br></div>
        <div><label> Password: <input type="password" name="password"/> </label><br><br></div>
        <div><input type="submit" value="Sign In"/></div>
    </form>
</body>
</html>
