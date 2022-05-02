<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <h1>Hello Admin</h1>
    <jsp:include page="partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>
        <button>logout</button>
    </div>



</body>
</html>
