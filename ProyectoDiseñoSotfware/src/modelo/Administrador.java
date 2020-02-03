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
public class Administrador extends Empleado {

    public Administrador(String usuario, String contraseña) {
        super(usuario, contraseña);
    }

    public Administrador(String usuario, String nombre, String apellido, String cedula, String correo, String domicilio, String telefonoTrabajo, EstadoCivil estadoCivil, int numeroHijos, String contraseña) {
        super(usuario, nombre, apellido, cedula, correo, domicilio, telefonoTrabajo, estadoCivil, numeroHijos, contraseña);
    }

    void añadirVendedor(Vendedor v) {
        Kioscos.usuarios.add(v);
    }
    

    @Override
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String getDomicilio() {
        return domicilio;
    }

    @Override
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    @Override
    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    @Override
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void registrarEmpleado() {

    }

    public void crearDatos() {

    }

    public void actualizarDatos() {

    }

    public void eliminarDatos() {

    }

    public void registrarDatos() {

    }

    public void iniciarSesion() {

    }
}
