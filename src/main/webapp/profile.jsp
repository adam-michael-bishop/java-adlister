<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 3/8/23
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <h1>Welcome <%= request.getParameter("username")%>!</h1>
</body>
</html>
