/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import include.Suscriptor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alfonso
 */
public class ModeloSuscriptores extends Conexion {

    public boolean crear_suscriptor(Suscriptor s) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "call insertarSuscriptor(?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, s.getCuenta());
            pst.setString(2, s.getEmail());
            pst.setString(3, s.getPassword());
            pst.setString(4, s.getFoto_perfil());

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

    public boolean autenticar(String user, String password) {
        boolean flag = false;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "call autenticar(?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.absolute(1)) {
                return true;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (getConnection() != null) {
                    getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ModeloSuscriptores ms = new ModeloSuscriptores();
        System.out.println(ms.autenticar("JoJo0", "ErinaKawai"));
    }
}
