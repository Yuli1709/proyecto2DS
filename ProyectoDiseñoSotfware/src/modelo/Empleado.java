/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Henry
 */
public class Empleado extends Usuario {

    public Empleado(String usuario, String contraseña, String nombre, String apellido, String cedula, String correo, String domicilio, String telefonoTrabajo, EstadoCivil estadoCivil, int numeroHijos) {
        super(usuario, contraseña, nombre, apellido, cedula, correo, domicilio, telefonoTrabajo, estadoCivil, numeroHijos);
    }
    
}
