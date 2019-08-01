function añadirCat(){
    var nuevaCat=document.getElementById("new-cat").value;
    document.getElementById("new-cat").value="";
    var viejaCat=document.getElementById("old-cat");
    var viejaCatIn=viejaCat.innerHTML;
    var unionCat=viejaCatIn+'<p class="ele-rev">'+nuevaCat+'</p>';
    document.getElementById("old-cat").innerHTML = unionCat;
}
function añadirRep(){
    var nuevaRep=document.getElementById("new-rep").value;
    document.getElementById("new-rep").value="";
    var viejaRep=document.getElementById("old-rep");
    var viejaRepIn=viejaRep.innerHTML;
    var unionRep=viejaRepIn+'<p class="ele-rev">'+nuevaRep+'</p>';
    document.getElementById("old-rep").innerHTML = unionRep;
}
function añadirDir(){
    var nuevoDir=document.getElementById("new-dir").value;
    document.getElementById("new-dir").value="";
    document.getElementById("dir").innerHTML = nuevoDir;
}
function añadirEst(){
    var nuevoEst=document.getElementById("new-est").value;
    document.getElementById("new-est").value="";
    document.getElementById("est").innerHTML = nuevoEst;
}
function añadirTit(){
    var nuevoTit=document.getElementById("new-tit").value;
    document.getElementById("new-tit").value="";
    document.getElementById("tit").innerHTML = nuevoTit;
}
function añadirSinop(){
    var nuevoSinop=document.getElementById("new-sinop").value;
    document.getElementById("new-sinop").value="";
    document.getElementById("sinopsis").innerHTML = nuevoSinop;
}