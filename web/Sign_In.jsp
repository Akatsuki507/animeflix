

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Suscripción</title>
        <link rel="stylesheet" href="css\suscripcion1.css">
    </head>
    <body>
        <div>
            <img src="fondo_suscripcion.gif" alt="Fondo 1" class="Fondo_suscripcion">
        </div>
        <div><a href="index.html">volver</a></div>
            <form action="crearsuscriptor" name="frm_newSuscriptor" method="POST" enctype="multipart/form-data" id="frm_newSuB" name= "Suscripcion" class="Sec_1">
            <h1 class="H1">Registra una Cuenta Gratuita</h1>
            <h2 class="H2">¡Únete a Animeflix! ¡Se tarda un clic!</h2> 
                
            <ul class="estructura"> 
                <li class="espaciom">
                    <div class="n">
                            <input type="text" id="nombre" class="net" placeholder="Nombre de usuario"/>
                    </div>
                </li>
                <li class="espaciom">
                    <div class="n">
                            <input class="net" type="email" id="email" placeholder="Correo electrónico"/>
                    </div>
                </li>
                <li class="espaciom">
                    <div class="n">
                            <input type="password" id="password" class="net" placeholder="Contraseña"/>
                    </div>
                </li>
                <li class="espaciom">
                    <div class="nm">
                        <input type="submit" class="nm1" value="CONTINUAR" id="btncrearsuscriptor"/>
                    </div>
                </li>
            </ul>  
        </form>  
    </body>
</html>
