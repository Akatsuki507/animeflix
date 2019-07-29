/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import include.Suscriptor;
import java.sql.PreparedStatement;

/**
 *
 * @author Alfonso
 */
public class ModeloSuscriptores extends Conexion {
    
    public boolean crear_suscriptor(Suscriptor s){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "call insertarSuscriptor(?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, s.getCuenta());
            pst.setString(2, s.getEmail());
            pst.setString(3, s.getPassword());  
            if(pst.executeUpdate() == 1 ){
                flag = true;
            }
        } catch(Exception e) { 
            
        } finally {
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        ModeloSuscriptores ms = new ModeloSuscriptores();
        System.out.println(ms.crear_suscriptor(new Suscriptor(0,"JoJo0","JonathanJoestar@gmail.com","ErinaKawai")));
    }
}
