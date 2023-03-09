<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="../partials/head.jsp"%>
<body>
<%@include file="../partials/navbar.jsp"%>
<form action="${pageContext.request.contextPath}/pickcolor" method="post">
    <label>
        Enter a color to set the page's background
        <input type="text" class="form-control" name="color">
    </label>
</form>
<%@include file="../partials/scripts.jsp"%>
</body>
</html>
