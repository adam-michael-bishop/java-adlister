<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<%@include file="../partials/head.jsp" %>
<body>
<div class="container">
    <h1>Ads</h1>
    <c:forEach var="ad" items="${adList}">
        <h4>${ad.getTitle()}</h4>
        <p>${ad.getDescription()}</p>
    </c:forEach>
    <br>
    <a href="${pageContext.request.contextPath}/ads/create" class="btn btn-primary" role="button">Create an ad</a>
</div>
</body>
</html>
