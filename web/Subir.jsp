<%-- 
    Document   : Subir
    Created on : 07/11/2019, 04:31:02 PM
    Author     : USUARIO 00
--%>

<%@page import="Entidades.Animes"%>
<%@page import="Procesos.Procesos_Anime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
       <%
       Procesos_Anime pAnime = new Procesos_Anime();
       Animes anime = new Animes(
               request.getParameter("Portada"),
               request.getParameter("descripcion"),
               request.getParameter("titulo"),
               Integer.parseInt(request.getParameter("Genero")),
               "QUEMADA"
       );
       int result = pAnime.InsertarAnime(anime);
       
if (result == 1){
    
       %> 
    <h1>Se inserto, corraaaaaaamnnnnnn</h1
    <%
    }else{%>
    <h1>No se inserto, F para jarvis</h1
    <%}%>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
