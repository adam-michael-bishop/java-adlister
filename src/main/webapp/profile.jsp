<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="partials/head.jsp"%>
<body>
<%@ include file="partials/navbar.jsp"%>
    <h1>Welcome <%= request.getAttribute("username")%>!</h1>
</body>
</html>
