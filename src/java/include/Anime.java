/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package include;

/**
 *
 * @author Alfonso
 */
public class Anime {

    private String Nombre_anime;
    private String Genero;
    private String Descripcion;
    private String Portada;
    private String Year;

    public Anime(String Nombre_anime, String Genero, String Descripcion, String Portada, String Year) {
        this.Nombre_anime = Nombre_anime;
        this.Genero = Genero;
        this.Descripcion = Descripcion;
        this.Portada = Portada;
        this.Year = Year;
    }
   
    /**
     * @return the Nombre_anime
     */
    public String getNombre_anime() {
        return Nombre_anime;
    }

    /**
     * @param Nombre_anime the Nombre_anime to set
     */
    public void setNombre_anime(String Nombre_anime) {
        this.Nombre_anime = Nombre_anime;
    }

    /**
     * @return the Genero
     */
    public String getGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Portada
     */
    public String getPortada() {
        return Portada;
    }

    /**
     * @param Portada the Portada to set
     */
    public void setPortada(String Portada) {
        this.Portada = Portada;
    }

    /**
     * @return the Year
     */
    public String getYear() {
        return Year;
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(String Year) {
        this.Year = Year;
    }

}
