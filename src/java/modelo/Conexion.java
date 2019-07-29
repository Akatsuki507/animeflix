/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alfonso
 */
public class Conexion {
    private String username = "root";
    private String password = "123456";
    private String hostname = "127.0.0.1";
    private String port = "3306";
    private String database = "animeflix";
    private String classname = "org.mariadb.jdbc.Driver";
    private String url = "jdbc:mariadb://"+hostname+":"+port+"/"+database;
    private Connection con;

    public Conexion() {
    try{
        Class.forName(classname);
        this.con = DriverManager.getConnection(url,username,password);
    } catch (ClassNotFoundException e) {
        System.err.println(e.getMessage());
    } catch (SQLException esql){
        System.err.println(esql.getMessage());
    }
    }
                                         
    public Connection getConnection(){
        return con;
    }
}
