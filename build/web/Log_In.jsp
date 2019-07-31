<%-- 
    Document   : Log_In
    Created on : jul 29, 2019, 6:18:19 a.m.
    Author     : Alfonso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="..\src\CSS\Inicio Sesion.css">
    <title>Login</title>
</head>
<body class="Body">
    <header class="Header1">
        <ul class="Lista_Header">
            <li>
                <img src="Logo_Netflix.png" alt="Logo Netflix" class="Logo">
            </li>
            <li>
                <img src="Foto_perfil.png" alt="" class="Foto_perfil"> 
            </li>
        </ul>
    </header>

    </div>
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
                    <td><input type="checkbox" class="Recuerdame" value="Recuerdame">Recuerdame</td>
                </tr>                
                <tr>
                    <td></td>
                    <td><input type="submit" value="Iniciar sesion" id="btncrearsuscriptor" class="Suscribete"></td>
                </tr>
            </table>
        </form>
    
        <input type="button" value="Suscribete ya" id="btncrearsuscriptor" class="Suscribete">
        
    
    <footer class="PiePagina">
        <div class="Pie">
                Numero de ayuda: +507 6996-0731<br>
                <a href="Pagina de acerca del proyecto.html">Acerca del proyecto!</a><br>
                <a href="pagina de contacto.html">Contactenos!</a> <br>
                Privacidad<br>
                Legalidad de la pagina
            <div>
                <img src="redes-sociales.png" alt="Social Media" class="Foto_foot">
            </div>
        </div>
    </footer>
</body>
</html>
