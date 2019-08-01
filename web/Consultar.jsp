<%-- 
    Document   : Consultar
    Created on : 07/11/2019, 05:12:14 PM
    Author     : USUARIO 00
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Animes"%>
<%@page import="Procesos.Procesos_Anime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Animeflix - Búsqueda</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="buscador.css" />
    <script src="main.js"></script>
</head>
<body>
        <header class="Header1">
                <ul class="Lista_Header">
                    <li>
                        <img src="Logo_Netflix.png" alt="Logo Netflix" class="Logo">
                    </li>
                    <li>
                        <a href="configuracioncuenta.html"><input type="button" value="Perfil de usuario" class="Login"></a>  
                    </li>
                </ul>
            </header>
    <section class="barra-busc">
        <div class="input-busc">
            <img class="img-busc" src="img/lupa.png">
            <input type="text" class="buscar">
        </div>
    </section>
    <nav class="categorias">
        <div class="dir-cat"></div>
        <a href=""><div class="cat" id="selected"><h3 class="ley-cat">Todas</h3></div></a>
        <a href=""><div class="cat"><h3 class="ley-cat">Shounen</h3></div></a>
        <a href=""><div class="cat"><h3 class="ley-cat">Shoujo</h3></div></a>
        <a href=""><div class="cat"><h3 class="ley-cat">Seinen</h3></div></a>
        <a href=""><div class="cat"><h3 class="ley-cat">Josei</h3></div></a>
        <a href=""><div class="cat"><h3 class="ley-cat">Aventuras</h3></div></a>
        <a href=""><div class="cat"><h3 class="ley-cat">Slice-of-life</h3></div></a>
        <a href="CREARTE.html"><div class="cat"><h3 class="ley-cat">Upload</h3></div></a>
        <a href=""><div class="dir-cat"></div></a>
    </nav>
    <section class="recomendacion">
        <div class="rec"><p class="ley-rec">Recomendación1</p></div>
        <div class="rec"><p class="ley-rec">Recomendación2</p></div>
        <div class="rec"><p class="ley-rec">Recomendación3</p></div>
        <div class="rec"><p class="ley-rec">Recomendación4</p></div>
        <div class="rec"><p class="ley-rec">Recomendación5</p></div>
        <div class="rec"><p class="ley-rec">Recomendación6</p></div>
    </section>
    <section class="resultados">
        <%
            Procesos_Anime pAnime = new Procesos_Anime();
            List<Animes> animes = new ArrayList<>();
            
            animes = pAnime.ConsultarAnimes();
            
            for(Animes anime : animes)
            {
        %>
        
        <a class="link-resul" href="anime.html"><div class="resul">
                <a href="      "><img class="img-res" src="<%= anime.getPortada() %>"></a> 
               <div class="texto-top">
                   <div class="titulo"><a href="      "><h4><%= anime.getNombre_anime()%></h4></a></div>
               </div>
               <div class="sinop"><p><%= anime.getDescripcion() %></p></div>
               <div class="fin-res"><h5 id="fin-izq">Shounen</h5><h5 id="fin-der">23 min x Capítulo</h5></div>
               <img class="fav" src="img/no-fav.png"> 
           </div>
       </a>
        <%}%>
    </section>
</body>
</html>
