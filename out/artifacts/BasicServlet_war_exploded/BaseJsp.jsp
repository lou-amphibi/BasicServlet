<%--
  Created by IntelliJ IDEA.
  User: LechE
  Date: 18.08.2020
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Base JSP</title>
</head>
<body>
    <h1> Testing JSP </h1>
    <p>
        <%@ page import ="java.util.Date, logic.TestClass" %>

        <%
            Date now = new Date();
            String cd = "Current date - " + now;
            TestClass testClass = new TestClass();
        %>

        <%= cd %>

        <%= "<p>" + testClass.getInfo()%>

        <%
            for (int i=0; i<5; i++) {
                out.println("<p>" + "Jsp say hello " + i + "</p>");
            }
        %>

        <%
            String name = request.getParameter("name");
        %>

        <%= "<p> Hello, " + name + "</p>"%>
    </p>
</body>
</html>
