<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="../partials/head.jsp"%>
<body>
<c:choose>
    <c:when test="${outcome.equals(\"tie\")}">
        <h3>TIE!</h3>
    </c:when>
    <c:when test="${outcome.equals(\"win\")}">
        <h3>YOU WIN!</h3>
    </c:when>
    <c:otherwise>
        <h3>YOU LOSE!</h3>
    </c:otherwise>
</c:choose>
<p>Computer chose: ${computerChoice}<br>You chose: ${userChoice}</p>

<%@include file="../partials/scripts.jsp"%>
</body>
</html>
