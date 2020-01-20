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
public class Cliente extends Usuario{
    protected String direccionTrabajo;
    protected String empresaTrabajo;
    protected LinkedList<Casa> casaDiseñada;

    
    public Cliente(String direccionTrabajo, String empresaTrabajo, String usuario, String contraseña, String nombre, String apellido, String cedula, String correo, String domicilio, String telefonoTrabajo, EstadoCivil estadoCivil, int numeroHijos) {
        super(usuario, contraseña, nombre, apellido, cedula, correo, domicilio, telefonoTrabajo, estadoCivil, numeroHijos);
        this.direccionTrabajo = direccionTrabajo;
        this.empresaTrabajo = empresaTrabajo;
        this.casaDiseñada = new LinkedList<>();
    }
    
    
    
}
