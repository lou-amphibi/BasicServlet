<%--
  Created by IntelliJ IDEA.
  User: LechE
  Date: 20.08.2020
  Time: 0:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Cart</title>
</head>
<body>
     <%@ page import = "logic.Cart" %>

     <% Cart cart = (Cart) session.getAttribute("cart"); %>

     <p> Name: <%= cart.getName()%> </p>
     <p> Count: <%= cart.getQuantity()%> </p>
</body>
</html>
