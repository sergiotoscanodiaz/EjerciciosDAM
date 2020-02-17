<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 17</title>
  </head>
  <body>
    
    <h1>Aquí tiene su coche personalizado</h1>

    <% String tapiceria = request.getParameter("tapiceria");
       String moldura = request.getParameter("moldura");
       String imagen = tapiceria + moldura + ".jpg";
    %>

    <p><img src="<%= imagen%>"></p>

  </body>
</html>
