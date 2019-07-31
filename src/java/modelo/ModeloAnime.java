/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import include.Anime;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alfonso
 */
public class ModeloAnime extends Conexion {
    
        public boolean crear_anime(Anime a){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "call insertarAnime(?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, a.getNombre_anime());
            pst.setString(2, a.getGenero());
            pst.setString(3, a.getDescripcion());
            pst.setString(4, a.getPortada());
            
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
}
