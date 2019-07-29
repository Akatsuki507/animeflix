<%-- 
    Document   : Log_In
    Created on : jul 29, 2019, 6:18:19 a.m.
    Author     : Alfonso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
    </head>
    <body>
        <a href="index.html">volver</a>
        <h1>Iniciar Sesion</h1>
        <form action="Log_in" name="frm_login">
            <table>
                <tr>
                    <td><label for="">Usuario:</label></td>
                    <td><input type="text" name="Nombre"></td>
                </tr>
                <tr>
                    <td><label for="">Password:</label></td>
                    <td><input type="text" name="Password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Iniciar sesion" id="btncrearsuscriptor"></td>
                </tr>
            </table>
        </form>
        
        <p>No tienes cuenta? puedes registrarte aqui </p>
        <a href="Sign_In.jsp">Registrarse</a>
        
    </body>
</html>
