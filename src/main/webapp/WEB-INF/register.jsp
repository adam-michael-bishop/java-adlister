<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 3/15/23
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Register Account"/>
</jsp:include>
<body>
<%@include file="partials/navbar.jsp" %>
<div class="container">
    <h1>Register Account</h1>
    <form action="${pageContext.request.contextPath}/register" method="post">
        <div class="form-group">
            <label for="username">Username</label>
            <input id="username" name="username" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="email">email</label>
            <input id="email" name="email" class="form-control" type="text" placeholder="something@example.com">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input id="password" name="password" class="form-control" type="password">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Register">
    </form>
</div>
</body>
</html>
