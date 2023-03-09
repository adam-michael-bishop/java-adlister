<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="/partials/head.jsp" %>
<body class="container">
<h1>hello.</h1>
<ul class="list-group">
    <li class="list-group-item"><a href="${pageContext.request.contextPath}/guess">Guessing game</a></li>
    <li class="list-group-item"><a href="${pageContext.request.contextPath}/pickcolor">Pick a color</a></li>
    <li class="list-group-item"><a href="${pageContext.request.contextPath}/pizza-order">Pizza order</a></li>
    <li class="list-group-item"><a href="${pageContext.request.contextPath}/login.jsp">Login form</a></li>
</ul>
<%@include file="/partials/scripts.jsp" %>
</body>
</html>
