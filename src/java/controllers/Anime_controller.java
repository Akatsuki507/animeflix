/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import include.Anime;
import javax.servlet.jsp.PageContext;
import modelo.ModeloAnime;
import static org.apache.coyote.http11.Constants.a;

/**
 *
 * @author Alfonso
 */
public class Anime_controller {

    public boolean crearAnime(Anime a) {
        ModeloAnime modeloA = new ModeloAnime();
        return modeloA.crear_anime(a);
    }

    public String getViewAnimes() {
        String htmlcode = "";

        ModeloAnime modeloa = new ModeloAnime();
        for (Anime a : modeloa.getAllanimes()) {
            htmlcode += "<a class=\"link-resul\" href=\"Animes_show.jsp?cod_anime=" + a.getCod_anime() + "\"><div class=\"resul\">\n"
                    + "                <a href=\"Animes_show.jsp?cod_anime=" + a.getCod_anime() + "\"><img class=\"img-res\" src=\"" + a.getPortada() + "\"></a> \n"
                    + "               <div class=\"texto-top\">\n"
                    + "                   <div class=\"titulo\"><a href=\"      \"><h4>" + a.getNombre_anime() + "</h4></a></div>\n"
                    + "               </div>\n"
                    + "               <div class=\"sinop\"><p>" + a.getDescripcion() + "</p></div>\n"
                    + "               <div class=\"fin-res\"><h5 id=\"fin-izq\">" + a.getGenero() + "</h5><h5 id=\"fin-der\">23 min x Capítulo</h5></div>\n"
                    + "                \n"
                    + "           </div>\n"
                    + "       </a>"
                    + "";
           
        }
        return htmlcode;
    }
    

    public String getDetallesAnime(int cod_anime) {
        Anime an = new ModeloAnime().getAnime(cod_anime);
        String htmlcode = "<div class=\"single\" >\n"
                + "         \n"
                + "		<div class=\"cont span_2_of_3\">\n"
                + "			  <div class=\"labout span_1_of_a1\">\n"
                + "				<!-- start product_slider -->\n"
                + "								<a href=\"optionallink.html\">\n"
                + "									<img class=\"etalage_thumb_image\" src=\"" + an.getPortada() + "\" />\n"
                + "								</a>\n"
                + "					\n"
                + "					\n"
                + "			<!-- end product_slider -->\n"
                + "			</div>\n"
                + "			<div class=\"cont1 span_2_of_a1\">\n"
                + "				<h3 class=\"m_3\">" + an.getNombre_anime() + "</h3>\n"
                + "				\n"
                + "				<div class=\"price_single\">\n"
                + "    			<p class=\"m_desc\">Ficha Tecnica</p>\n"
                + "    			\n"
                + "                <div class=\"social_single\">	\n"
                + "				   <ul>	\n"
                + "					  <li class=\"fb\"><span>Nombre : " + an.getNombre_anime() + "</span></li>\n"
                + "					  <li class=\"tw\"><span>Genero : " + an.getGenero() + "</span></li>\n"
                + "					  <li class=\"g_plus\"><span>Year Lanzamiento : " + an.getYear() + "</span></li>\n"
                + "					  <li class=\"rss\"><span> </span></a></li>		\n"
                + "				   </ul>\n"
                + "			    </div>\n"
                + "			</div>\n"
                + "			<div class=\"clear\"></div>\n"
                + "     \n"
                + "	   \n"
                + "	 <div class=\"toogle\">\n"
                + "     	<h3 class=\"m_3\">Descripcion</h3>\n"
                + "     	<p class=\"m_text\">" + an.getDescripcion() + "</p>\n"
                + "     </div>					\n"
                + "	 <div class=\"toogle\">\n"
                + "     	<h3 class=\"m_3\">Product Reviews</h3>\n"
                + "     </div>\n"
                + "     </div>\n"
                + "     <div class=\"clear\"></div>\n"
                + "	 \n"
                + "	 \n"
                + "       </div>";
        return htmlcode;
    }

    public static void main(String[] args) {
        Anime an = new ModeloAnime().getAnime(6);
        System.out.println(an.getCod_anime());
    }

}
