<%-- 
    Document   : index
    Created on : 25 ago. 2021, 20:35:51
    Author     : prantony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
        <title>Calcula tu nota</title>
    </head>
    <body>
        <div class="section">
        <h1 class="title"> En el siguiente formulario podras calcular tu nota!!</h1>
        <form action="Controlador" method="POST">
            <label class="label">Ingrese sus nombres completos
                <input class="input" type="text" name="fullname">
            </label>
            <table class="table">
            <tr>
            <th>Notas</th>
            <th>Nota 1</th>
            <th>Nota 2</th>
            <th>Nota 3</th>
            <th>Nota 4</th>
            <th>Nota 5</th>
            </tr>
            <tr>
                <td class="label">Trabajos</td>
                <td><input class="input is-small" type="number" name="tr1" value="${ayudante.datos.tr1}"></td>
                <td><input class="input is-small" type="number" name="tr2" value="${ayudante.datos.tr2}"></td>
                <td><input class="input is-small" type="number" name="tr3" value="${ayudante.datos.tr3}"></td>
                <td><input class="input is-small" type="number" name="tr4" value="${ayudante.datos.tr4}"></td>
                <td><input class="input is-small" type="number" name="tr5" value="${ayudante.datos.tr5}"></td>
            </tr>
            <tr>
                <td class="label">Investigacion</td>
                <td><input class="input is-small" type="number" name="inv1" value="${ayudante.datos.inv1}"></td>
                <td><input class="input is-small" type="number" name="inv2" value="${ayudante.datos.inv2}"></td>
            </tr>
                        <tr>
                <td class="label">Parciales</td>
                <td><input class="input is-small" type="number" name="exm1" value="${ayudante.datos.exm1}"></td>
                <td><input class="input is-small" type="number" name="exm2" value="${ayudante.datos.exm2}"></td>
                <td><input class="input is-small" type="number" name="exm3" value="${ayudante.datos.exm3}"></td>
                <td><input class="input is-small" type="number" name="exm4" value="${ayudante.datos.exm4}"></td>
                <td><input class="input is-small" type="number" name="exm5" value="${ayudante.datos.exm5}"></td>
            </tr>
                        <tr>
                <td class="label">Participacion</td>
                <td><input class="input is-small" type="number" name="prt1" value="${ayudante.datos.prt1}"></td>
                <td><input class="input is-small" type="number" name="prt2" value="${ayudante.datos.prt2}"></td>
                <td><input class="input is-small" type="number" name="prt3" value="${ayudante.datos.prt3}"></td>
                <td><input class="input is-small" type="number" name="prt4" value="${ayudante.datos.prt4}"></td>
                <td><input class="input is-small" type="number" name="prt5" value="${ayudante.datos.prt5}"></td>
            </tr>
                        <tr>
                <td class="label">Examen Final</td>
                <td><input class="input is-small" type="number" name="efnl" value="${ayudante.datos.efnl}"></td>
            </tr>
            </table>
            <input class="button is-primary" type="submit" value="Calcular" name="evaluador">
            </form>
        
     </div>
    </body>
    
</html>
