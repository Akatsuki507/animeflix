function funcionFav(){
    var oldFav=document.getElementById("enviarFav").outerHTML;
    var oldFav2=oldFav.outerHTML;
    console.log(oldFav);
    var newFav='<img class="fav" src="img/no-fav.png">';
    document.getElementById("enviarFav").outerHTML = newFav;
    console.log(newFav);
}