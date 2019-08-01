/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import include.Anime;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Alfonso
 */
public class ModeloAnime extends Conexion {

    public boolean crear_anime(Anime a) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "call insertarAnime(?,?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, a.getNombre_anime());
            pst.setString(2, a.getGenero());
            pst.setString(3, a.getDescripcion());
            pst.setString(4, a.getPortada());
            pst.setString(5, a.getYear());

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
    
    public ArrayList<Anime> getAllanimes(){
        ArrayList<Anime> animes = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "call SelectAllanimes()";
            pst = getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                animes.add(new Anime(rs.getInt("cod_anime"),rs.getString("Nombre_anime"), rs.getString("Genero"), rs.getString("Descripcion"), rs.getString("Portada"), rs.getString("Year")));
            }
        } catch (Exception e) {
        }finally{
            try {
                if (getConnection() != null)getConnection().close();
                if (pst != null)pst.close();
                if(rs != null)rs.close();
            } catch (Exception e) {
            }
        }
        return animes;
    }    
    
    public Anime getAnime(int cod_anime){
        Anime animes = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "call SelectoneAnime(?)";
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, cod_anime);
            rs = pst.executeQuery();
            while(rs.next()){
                animes = new Anime(rs.getInt("cod_anime"),rs.getString("Nombre_anime"), rs.getString("Genero"), rs.getString("Descripcion"), rs.getString("Portada"), rs.getString("Year"));
            }
        } catch (Exception e) {
        }finally{
            try {
                if (getConnection() != null)getConnection().close();
                if (pst != null)pst.close();
                if(rs != null)rs.close();
            } catch (Exception e) {
            }
        }
        return animes;
    }

    public static void main(String[] args) {
        ModeloAnime ma = new ModeloAnime();
        Anime anime = ma.getAnime(12);
        System.out.println(anime.getCod_anime());
        System.out.println(anime.getNombre_anime());
        
        
    }
}
