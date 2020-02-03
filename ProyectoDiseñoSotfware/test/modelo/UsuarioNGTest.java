/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class UsuarioNGTest {
    
  
    @Test
    public void testGetPassUsuario() {
        System.out.println("getUsuario");
        Usuario instance = new Usuario("user","juan","loor","122322","juanjoloor","BosquesDeLaCosta","45354",EstadoCivil.Soltero,2,"pass");
        Usuario instance2 = new Usuario("user","pass");
        String expResult = "";
        String result = instance.getUsuario();
        String result2 = instance.getUsuario();
        assertEquals(result,result2); 
    }

    
}
