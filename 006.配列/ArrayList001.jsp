<%-- 
    Document   : newjsp7
    Created on : 2018/05/16, 13:49:51
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@page import="java.util.ArrayList" %>
    <%
    ArrayList<String>datas= new ArrayList<String>();
            
            datas.add("10");
            datas.add("100");
            datas.add("Soeda");
            datas.add("hayashi");
            datas.add("-20");
            datas.add("180");
            datas.add("END");
            
            out.print(datas);
            
            %>
            
            
    <%
    
    
    
    %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
