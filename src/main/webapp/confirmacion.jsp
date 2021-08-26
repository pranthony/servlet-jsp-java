<%-- 
    Document   : confirmacion
    Created on : 25 ago. 2021, 23:42:22
    Author     : prantony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exito!!</title>
    </head>
    <body>
        <h1>Los datos han sido agregados exitosamente</h1>
        <p>Haga <a href="index.jsp">click aqui</a> para volver a la pagina principal</p>
        <form action="Controlador" method="POST">
            <input type="hidden" name="inicio" value="inicio">
        </form>
    </body>
</html>
