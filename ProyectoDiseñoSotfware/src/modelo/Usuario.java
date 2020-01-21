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
public class Usuario {
     protected String usuario;
     protected String contraseña;
     protected String nombre;
     protected String apellido;
     protected String cedula;
     protected  String correo;
     protected  String domicilio;
     protected  String telefonoTrabajo;
     protected EstadoCivil estadoCivil;
     protected int numeroHijos;

    public Usuario(String usuario, String contraseña, String nombre, String apellido, String cedula, String correo, String domicilio, String telefonoTrabajo, EstadoCivil estadoCivil, int numeroHijos) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.domicilio = domicilio;
        this.telefonoTrabajo = telefonoTrabajo;
        this.estadoCivil = estadoCivil;
        this.numeroHijos = numeroHijos;
    }

    public void iniciarSesion(){
        
    }
     
     
     
     
    
}
