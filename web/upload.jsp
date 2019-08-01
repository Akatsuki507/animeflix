<%-- 
    Document   : upload
    Created on : jul 31, 2019, 6:25:29 p.m.
    Author     : Alfonso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload</title>
    </head>
    <body>
        <h1>Subir Anime</h1>
        <form action="crearAnime" name="frm_newSuscriptor" method="POST" enctype="multipart/form-data" id="frm_newSuB">
            <table>
                <tr>
                    <td><label for="">Nombre Anime</label></td>
                    <td><input type="text" name="Nombre" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for="">genero</label></td>
                    <td>
                        <select name="genero" id="genero">
                            <%for(int i = 1; i <= 5; i++ ){ %>
                                <%if(i == 1){ %>
                                    <option value="Shonen">Shonen</option>
                                <% } %>
                                <%if(i == 2){ %>
                                    <option value="Yuri">Yuri</option>
                                <% } %>
                                <%if(i == 3){ %>
                                    <option value="Shoyo">Shoyo</option>
                                <% } %>
                                <%if(i == 4){ %>
                                    <option value="Isekai">Isekai</option>  
                                <% } %>
                                <%if(i == 5){ %>
                                    <option value="Terror">Terror</option>
                                <% } %>
                            <% } %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><label for="">Descripcion</label></td>
                    <td><textarea cols="30" rows="6" name="Descripcion" id="Descripcion"></textarea></td>
                </tr>
                <tr>
                    <td><label for="">portada</label></td>
                    <td><input type="file" name="file" id="archivos"></td>
                </tr>
                <tr>
                    <td><label for="">Año</label></td>
                    <td><input type="text" name="year" id="year"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="crear Anime" id="btncrearsuscriptor"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
