<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="../partials/head.jsp" %>
<body>
<%@include file="../partials/navbar.jsp" %>
<h1>Build Your Pizza!</h1>
<form action="${pageContext.request.contextPath}/pizza-order" method="post">
    <label>
        Crust Type
        <select name="crust-type" class="form-select">
            <option value="1" selected>Hand-tossed</option>
            <option value="2">Thin</option>
            <option value="3">Stuffed crust</option>
            <option value="4">Gluten free</option>
        </select>
    </label>
    <label>
        Sauce Type
        <select name="sauce-type" class="form-select">
            <option value="1" selected>Marinara</option>
            <option value="2">Alfredo</option>
            <option value="3">BBQ</option>
            <option value="4">Pesto</option>
        </select>
    </label>
    <label>
        Size
        <select name="size" class="form-select">
            <option value="1">Small - 10"</option>
            <option value="2" selected>Medium - 12"</option>
            <option value="3">Large - 14"</option>
            <option value="4">Extra Large - 16"</option>
        </select>
    </label>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="pepperoni" id="topping-pepperoni" name="topping">
        <label class="form-check-label" for="topping-pepperoni">
            Pepperoni
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" value="sausage" id="topping-sausage" name="topping">
        <label class="form-check-label" for="topping-sausage">
            Sausage
        </label>
    </div>
    <label for="delivery-address" class="form-label">Delivery Address</label>
    <input type="text" class="form-control" id="delivery-address" name="delivery-address" placeholder="1234 Something Ln.">
    <button type="submit" class="btn btn-primary">Submit Order</button>
</form>

<c:if test="${orderSubmitted}">
    <p>Order submitted</p>
</c:if>
<%@include file="../partials/scripts.jsp" %>
</body>
</html>
<%request.setAttribute("orderSubmitted", "false");%>