/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import include.Suscriptor;
import modelo.ModeloSuscriptores;

/**
 *
 * @author Alfonso
 */
public class Suscriptor_controller {
    public boolean crearSuscriptor(Suscriptor s){
        ModeloSuscriptores modeloS = new ModeloSuscriptores();
        return modeloS.crear_suscriptor(s);
    }
}
