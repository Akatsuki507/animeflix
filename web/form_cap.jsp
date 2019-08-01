<%-- 
    Document   : form_cap
    Created on : ago 1, 2019, 9:57:19 a.m.
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
<form action="" name="frm_newCap" method="POST" enctype="multipart/form-data" id="frm_newcap">
            <table>
                <tr>
                    <td><label for="">Episodio</label></td>
                    <td><input type="text" name="Nombre" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for=""></label></td>
                    <td><input type="file" name="file" id="archivos"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="crear Suscriptor" id="btncrearsuscriptor"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
