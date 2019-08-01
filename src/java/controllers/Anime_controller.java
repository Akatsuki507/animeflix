/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import include.Anime;
import modelo.ModeloAnime;

/**
 *
 * @author Alfonso
 */
public class Anime_controller {
    public boolean crearAnime(Anime a){
        ModeloAnime modeloA = new ModeloAnime();
        return modeloA.crear_anime(a);
    }
    
}
