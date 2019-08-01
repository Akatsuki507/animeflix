
function mostrarImgNewAnime(){
    var imgNewAnime=document.getElementById("img-new-anime").files[0].name;
    var rutaImage='img\fotosPerfil\1.jpg';
    var showImage='<img id="sample-img-new-anime" src="'+rutaImage+'">';
    document.getElementById("show-img-new-anime").innerHTML = showImage;
}