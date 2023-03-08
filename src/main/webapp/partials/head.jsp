<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 3/8/23
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String uri = request.getRequestURI();
    String fileName = uri.substring(uri.lastIndexOf("/") + 1, uri.lastIndexOf(".jsp"));
    String title = fileName.substring(0, 1).toUpperCase() + fileName.substring(1);
%>
<head>
    <title><%=title%></title>
</head>
