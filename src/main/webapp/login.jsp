<%--
  Created by IntelliJ IDEA.
  User: mattmartinez
  Date: 4/26/22
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<%@ include file="partials/head.jsp"%>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("admin");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("password")){
            response.sendRedirect("profile.jsp");
        }else {
            response.sendRedirect("login.jsp");
        }

    }
%>



<form method="post">
    <div class="mb-3 mt-3">
        <label for="exampleInputEmail1" class="form-label">Username</label>
        <input type="text" class="form-control w-50" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Password</label>
        <input type="password" class="form-control w-50" id="exampleInputPassword1">
    </div>
    <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">remember me</label>
    </div>
    <button class="btn btn-primary">Submit</button>
</form>
</body>
</html>
