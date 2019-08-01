<%-- 
    Document   : Home
    Created on : jul 31, 2019, 6:15:01 p.m.
    Author     : Alfonso
--%>

<%@page import="controllers.Anime_controller"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Animeflix - Búsqueda</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" media="screen" href="css/buscador.css" />
    </head>
    <body>
        <%
            Anime_controller Ac = new Anime_controller();
        %>
        <%= Ac.getViewAnimes()%>
    </body>
</html>
