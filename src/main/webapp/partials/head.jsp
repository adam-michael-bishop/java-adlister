<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String uri = request.getRequestURI();
    String fileName = uri.substring(uri.lastIndexOf("/") + 1, uri.lastIndexOf(".jsp"));
    String title = fileName.substring(0, 1).toUpperCase() + fileName.substring(1);
%>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <title><%=title%>
    </title>
</head>