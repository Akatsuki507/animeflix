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
        <link href="bootstrap.min.css" rel="stylesheet" type="text/css" >
        <link href="SubirAnime.css" rel="stylesheet" type="text/css" >
        <script src="main.js"></script>
    </head>
    <body>
                <section class="new-anime row">
                    <div class="col-sm-12"> 
                        <h1 class="text-light display-1">Subir Anime</h1>
                    </div>
                </section>
                <form action="crearAnime" name="frm_newSuscriptor" method="POST" enctype="multipart/form-data" id="frm_newSuB">
                    <section class="new-anime row">
                            <div class="col-sm-4">
                            <div class="form-group">
                                <label for="nombre" class="text-light"><h4>Nombre Anime</h4></label>
                                <input type="text" class="form-control" name="Nombre" id="nombre">
                            </div>
                            <div class="form-group">
                                <label for="Descripcion" class="text-light"><h4>Descripción:</h4></label>
                                <textarea class="form-control" cols="30" rows="6" name="Descripcion" id="Descripcion"></textarea>
                            </div>
                            <input type="submit" value="Crear Anime" class="btn-lg btn-success" id="btncrearsuscriptor">
                            </div>
                            <div class="col-sm-4">
                                <div class="form-group">
                                    <label for="genero" class="text-light"><h4>Género:</h4></label>
                                    <select class="form-control" id="genero">
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
                                        </div> 
                            <div class="form-group">
                                    <label for="year" class="text-light"><h4>Año</h4></label>
                                    <input type="text" class="form-control" name="year" id="year">
                            </div>
                            <div>
                                    <label for="archivos" class="text-light"><h4>Portada:</h4></label>
                                    <input onchange="mostrarImgNewAnime()" type="file" name="file" class="form-control-file border text-light" id="archivos">
                                    <div id="show-img-new-anime"></div>
                            </div>
                            <input type="submit" value="Crear Anime" class="btn-lg btn-success" id="btncrearsuscriptor">
                        </div>
                        <div class="col-sm-4">
                            <img id="sample-img-new-anime" src="img\Miku.png">
                        </div>     
                </section>
            </form>
    </body>
</html>
