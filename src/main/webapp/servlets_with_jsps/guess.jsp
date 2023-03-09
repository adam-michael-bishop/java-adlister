<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="../partials/head.jsp" %>
<body>
<div class="container">
    <h3>Choose your weapon:</h3>
    <form action="${pageContext.request.contextPath}/guess" method="post">
        <div class="form-check">
            <input class="form-check-input" type="radio" name="rps-choice" id="choice-rock" value="rock" checked>
            <label class="form-check-label" for="choice-rock">
                Rock
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="rps-choice" id="choice-paper" value="paper">
            <label class="form-check-label" for="choice-paper">
                Paper
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="rps-choice" id="choice-scissors" value="scissors">
            <label class="form-check-label" for="choice-scissors">
                Scissors
            </label>
        </div>
        <button type="submit" class="btn btn-danger">Fight!</button>
    </form>
</div>
<%@include file="../partials/scripts.jsp" %>
</body>
</html>
