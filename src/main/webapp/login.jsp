<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="partials/head.jsp"%>
<body>
<%@ include file="partials/navbar.jsp"%>
<h1>Welcome!</h1>
<form action="${pageContext.request.contextPath}/login" method="POST">
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
