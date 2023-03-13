<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="../partials/head.jsp"%>
<body>
    <h1>Ads</h1>
    <c:forEach var="ad" items="${adList}">
        <h4>${ad.getTitle()}</h4>
        <p>${ad.getDescription()}</p>
    </c:forEach>
</body>
</html>
