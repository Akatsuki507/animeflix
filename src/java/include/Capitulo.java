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
public class Capitulo {
    private int cod_capitulo;
    private int cod_anime;
    private String video;
    private int numero_cap;

    public Capitulo(int cod_capitulo, int cod_anime, String video, int numero_cap) {
        this.cod_capitulo = cod_capitulo;
        this.cod_anime = cod_anime;
        this.video = video;
        this.numero_cap = numero_cap;
    }

    public int getCod_capitulo() {
        return cod_capitulo;
    }

    public void setCod_capitulo(int cod_capitulo) {
        this.cod_capitulo = cod_capitulo;
    }

    public int getCod_anime() {
        return cod_anime;
    }

    public void setCod_anime(int cod_anime) {
        this.cod_anime = cod_anime;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public int getNumero_cap() {
        return numero_cap;
    }

    public void setNumero_cap(int numero_cap) {
        this.numero_cap = numero_cap;
    }
    
    
}
