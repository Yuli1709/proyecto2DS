/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD_Singleton;

import java.sql.Connection;
import java.sql.SQLException;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Juan Jose
 */
public class ConexionNGTest {
    

    @Test
    public void testGetConexion() throws Exception {
        System.out.println("getConexion");
        Connection expResult = null;
        Conexion conexion = Conexion.getConexion();
        assertFalse(conexion==expResult);
      
    
    }
    
    @Test
    public void testGetConnection() throws SQLException {
        System.out.println("getConnection");
        Conexion instance = Conexion.getConexion();
        Connection expResult = null;
        assertFalse(expResult==instance);
    }

   
  
    
}
