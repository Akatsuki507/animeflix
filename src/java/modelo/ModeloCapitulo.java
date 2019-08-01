/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import include.Capitulo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Alfonso
 */
public class ModeloCapitulo extends Conexion{
    
        public boolean crear_capitulo(Capitulo c) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "call insertarCapitulo(?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setInt(1, c.getCod_capitulo());
            pst.setString(2, c.getVideo());
            pst.setInt(3, c.getNumero_cap());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e) {

        } finally {
            try {
                if (getConnection() != null) {
                    getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        ModeloCapitulo mc = new ModeloCapitulo();
        System.out.println(mc.crear_capitulo(new Capitulo(0, 7, "Default path", 1)));
    }
}
