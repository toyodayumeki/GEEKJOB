<%-- 
    Document   : switch002
    Created on : 2018/05/14, 14:21:01
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
       int type = 'A';
       switch (type) {
           
           case 'A':
           out.print("英語");
           break;
           
           case 'あ':
               out.print("日本語");
               break;
               
    
                       
                   
       }
       
        
    %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
