<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 3/8/23
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getParameter("username") == null || request.getParameter("password") == null) {
        return;
    }
    if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
        response.sendRedirect("profile.jsp");
        return;
    }
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Welcome!</h1>
<form action="login.jsp" method="POST">
    <h3>Login: </h3>
    <div style="display: flex; flex-direction: column; width: 16em">
        <label style="display: flex; flex-direction: column">
            <input type="text" name="username" placeholder="username">
        </label>
        <label style="display: flex; flex-direction: column">
            <input type="password" name="password" placeholder="password">
        </label>
        <input type="submit">
    </div>
</form>
</body>
</html>
