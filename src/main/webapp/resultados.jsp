<%-- 
    Document   : resultados
    Created on : 25 ago. 2021, 23:17:28
    Author     : prantony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        
        
        <h1>Resumen de las notas</h1>
        
        <h3>Promedio Trabajos: ${ayudante.datos.tr_promedio}</h3>
        <h3>Promedio Investigacion ${ayudante.datos.inv_promedio}</h3>
        <h3>Promedio Examenes Parciales: ${ayudante.datos.exm_promedio}</h3>
        <h3>Promedio Participación: ${ayudante.datos.prt_promedio}</h3>
        <h3>Promedio Examen Final: ${ayudante.datos.efnl}</h3>
        <h3>Promedio Promedio Final: ${ayudante.datos.promedio_final}</h3>
        
        
        
        <form action="Controlador" method="POST">
            <input type="submit" value="Editar" name="editar">
            <input type="submit" values="Confirmar" name="confirmar">
                <input class="input is-small" type="hidden" name="tr1" value="${ayudante.datos.tr1}">
                <input class="input is-small" type="hidden" name="tr2" value="${ayudante.datos.tr2}">
                <input class="input is-small" type="hidden" name="tr3" value="${ayudante.datos.tr3}">
                <input class="input is-small" type="hidden" name="tr4" value="${ayudante.datos.tr4}">
                <input class="input is-small" type="hidden" name="tr5" value="${ayudante.datos.tr5}">

             
                <input class="input is-small" type="hidden" name="inv1" value="${ayudante.datos.inv1}">
                <input class="input is-small" type="hidden" name="inv2" value="${ayudante.datos.inv2}">

           
                <input class="input is-small" type="hidden" name="exm1" value="${ayudante.datos.exm1}">
                <input class="input is-small" type="hidden" name="exm2" value="${ayudante.datos.exm2}">
                <input class="input is-small" type="hidden" name="exm3" value="${ayudante.datos.exm3}">
                <input class="input is-small" type="hidden" name="exm4" value="${ayudante.datos.exm4}">
                <input class="input is-small" type="hidden" name="exm5" value="${ayudante.datos.exm5}">

          
                <input class="input is-small" type="hidden" name="prt1" value="${ayudante.datos.prt1}">
                <input class="input is-small" type="hidden" name="prt2" value="${ayudante.datos.prt2}">
                <input class="input is-small" type="hidden" name="prt3" value="${ayudante.datos.prt3}">
                <input type="hidden" name="prt4" value="${ayudante.datos.prt4}">
                <input type="hidden" name="prt5" value="${ayudante.datos.prt5}">

           
                <input  type="hidden" name="efnl" value="${ayudante.datos.efnl}">
        </form>
        
    </body>
</html>
