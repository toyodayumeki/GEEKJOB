<%-- 
    Document   : for003
    Created on : 2018/05/21, 15:37:27
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
    int total= 0;
for (int i = 1; i<= 100; i++) {
   total = total + i;
}

out.print(total);

    
    
    %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
