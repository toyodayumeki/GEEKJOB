<%-- 
    Document   : newjsp4
    Created on : 2018/05/14, 10:47:41
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
  int num =1;
  
  if(num==1){out.print("1です");
  }
   else if( num==2){
  out.print("プログラミングキャンプ！");
  }else{
  out.print("その他です");
  }
 
%>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
