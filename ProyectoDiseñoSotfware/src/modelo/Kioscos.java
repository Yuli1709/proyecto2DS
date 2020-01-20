/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author Henry
 */
public class Kioscos {
    
    protected int numeroKiosco;
    protected String direccion;
    protected String centroComercial; 
    protected LinkedList<Usuario> usuarios;

    public Kioscos(int numeroKiosco, String direccion, String centroComercial) {
        this.numeroKiosco = numeroKiosco;
        this.direccion = direccion;
        this.centroComercial = centroComercial;
        usuarios = new LinkedList<>();
    }
    
    
    
    
}
