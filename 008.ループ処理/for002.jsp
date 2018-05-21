<%-- 
    Document   : newjsp10
    Created on : 2018/05/21, 15:24:43
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
    for (int i = 0; i < 30; i++) {
    out.print("A");
    }
    
    %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
