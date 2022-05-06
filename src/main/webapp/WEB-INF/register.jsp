<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Register Here"/>
    </jsp:include>

</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<form action="login.jsp" method="post">
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>
    <br>
    <label for="username"><b>username</b></label>
    <input type="text" placeholder="Enter username" name="username" id="username" required>
    <br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw" required>
</form>

</body>
</html>
