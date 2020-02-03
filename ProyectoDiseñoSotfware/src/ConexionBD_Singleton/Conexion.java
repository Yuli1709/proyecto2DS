/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD_Singleton;



import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author juanjoseloor
 */
public class Conexion {
    private static Conexion conexion;
    private Connection connection;
    
    private Conexion(){
        
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
    
    public static  Conexion getConexion() throws SQLException{
        if (conexion==null){
            conexion=new Conexion();
            conexion.setConnection(DriverManager.getConnection("jdbc:mysql://127.0.0.1:3309/my_Home", "root", "proyecto"));
            return conexion;
        }
        else{
            return conexion;
        }
    }
    
}