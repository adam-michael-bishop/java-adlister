<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 3/8/23
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="partials/head.jsp"%>
<body>
<%@ include file="partials/navbar.jsp"%>
    <h1>Welcome <%= request.getAttribute("username")%>!</h1>
</body>
</html>
