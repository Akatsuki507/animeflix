<%-- 
    Document   : crearSuscriptor
    Created on : jul 29, 2019, 5:19:42 a.m.
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
            <jsp:include page="header.jsp"/>
        <a href="index.html">volver</a>
        <h1>Registrese</h1>
        <form action="crearsuscriptor" name="frm_newSuscriptor" method="POST" enctype="multipart/form-data" id="frm_newSuB">
            <table>
                <tr>
                    <td><label for="">Usuario:</label></td>
                    <td><input type="text" name="Nombre" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for="">Correo:</label></td>
                    <td><input type="text" name="email" id="email"></td>
                </tr>
                <tr>
                    <td><label for="">Password:</label></td>
                    <td><input type="text" name="Password" id="password"></td>
                </tr>
                <tr>
                    <td><label for="">Foto de Perfil:</label></td>
                    <td><input type="file" name="file" id="archivos"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="crear Suscriptor" id="btncrearsuscriptor"></td>
                </tr>
            </table>
        </form>
        <jsp:include page="footer.jsp"/>
        
    </body>
</html>
