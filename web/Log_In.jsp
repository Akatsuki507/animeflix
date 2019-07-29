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
        <title>JSP Page</title>
    </head>
    <body>
        <a href="index.html">volver</a>
        <h1>Iniciar Sesion</h1>
        <form action="crearsuscriptor" name="frm_newSuscriptor" method="POST" enctype="multipart/form-data" id="frm_newSuB">
            <table>
                <tr>
                    <td><label for="">Usuario:</label></td>
                    <td><input type="text" name="Nombre" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for="">Password:</label></td>
                    <td><input type="password" name="Password" id="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="crear Suscriptor" id="btncrearsuscriptor"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
