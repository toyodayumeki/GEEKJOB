<%-- 
    Document   : while001
    Created on : 2018/05/21, 16:28:01
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
   int num = 1000;
while (num>=100){
    num=num*1/2;
}
out.print(num);


    
    
    %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
