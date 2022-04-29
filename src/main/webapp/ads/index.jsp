<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index JSP</title>
</head>
<body>
    <h1>Here are all the products.</h1>
    

    <c:forEach var="ad" items="${}">
        <div class="ads">
            <h2>${ad.name}</h2>
            <p>Price: $ ${ad.price}</p>
        </div>
    </c:forEach>

</body>
</html>
