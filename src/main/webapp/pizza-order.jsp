<%@ page import="javax.servlet.annotation.WebServlet" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter" %>
<%--
  Created by IntelliJ IDEA.
  User: mattmartinez
  Date: 4/27/22
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%
  @WebServlet(name = "PizzaOrder", urlPatterns = "/pizza-order")
  class PizzaOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
//      response.setContentType("text/html");
//      PrintWriter out = response.getWriter();
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      String topping = request.getParameter("topping");
//      request.setAttribute("topping", topping);

      System.out.println(topping);
    }

  }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<!--form-->
<form method="POST">
  <label for="pizza">Make your pizza</label>
  <select id="pizza" name="pizza">
    <option value="crust">Crust Type</option>
    <option value="sauce">Sauce Type</option>
    <option value="size">Size Type</option>
  </select>
  <br>
  <input type="checkbox" id="topping1" name="topping1" value="pepperoni">
  <label for="topping1"> Pepperoni</label><br>
  <input type="checkbox" id="topping2" name="topping2" value="mushrooms">
  <label for="topping2"> Mushroom</label><br>
  <input type="checkbox" id="topping3" name="topping3" value="peppers">
  <label for="topping3"> Peppers</label>
  <br>
  <label for="address">Enter Address:</label><br>
  <input type="text" id="address" name="address">
  <input type="submit" value="Submit">
</form>

</body>
</html>
