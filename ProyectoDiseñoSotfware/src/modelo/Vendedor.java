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
public class Vendedor extends Empleado {

    public Vendedor(String usuario, String nombre, String apellido, String cedula, String correo, String domicilio, String telefonoTrabajo, EstadoCivil estadoCivil, int numeroHijos, String contraseña) {
        super(usuario, nombre, apellido, cedula, correo, domicilio, telefonoTrabajo, estadoCivil, numeroHijos, contraseña);
    }

    public Vendedor(String usuario, String contraseña) {
        super(usuario, contraseña);
    }

    public Cliente revisarDatosClientes() {
        return null;
    }

    @Override
    public void diseñarCasa() {
        Kioscos.usuarios.add(this);
    }

    public void verCasasDiseñadas() {

    }

    public void generarReporte() {
        //accedera a enviarcorreo para geenrar el reporte
    }

    private void enviarCorreo() {

    }

    @Override
    public void iniciarSesion() {

    }
}
