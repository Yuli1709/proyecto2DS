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
    protected boolean registrado;

    public Cliente(String usuario, String contraseña) {
        super(usuario, contraseña);
    }

    
    public Cliente(String direccionTrabajo,String usuario, String empresaTrabajo,  String contraseña, String nombre, String apellido, String cedula, String correo, String domicilio, String telefonoTrabajo, EstadoCivil estadoCivil, int numeroHijos) {
        super(usuario, contraseña, nombre, apellido, cedula, correo, domicilio, telefonoTrabajo, estadoCivil, numeroHijos);
        this.direccionTrabajo = direccionTrabajo;
        this.empresaTrabajo = empresaTrabajo;
        this.casaDiseñada = new LinkedList<>();
        this.registrado=false;
    }

    public String getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public void setDireccionTrabajo(String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }

    public String getEmpresaTrabajo() {
        return empresaTrabajo;
    }

    public void setEmpresaTrabajo(String empresaTrabajo) {
        this.empresaTrabajo = empresaTrabajo;
    }

    public LinkedList<Casa> getCasaDiseñada() {
        return casaDiseñada;
    }

    public void setCasaDiseñada(LinkedList<Casa> casaDiseñada) {
        this.casaDiseñada = casaDiseñada;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    @Override
    public String getContraseña() {
        return contraseña;
    }

    @Override
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

    @Override
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

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

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
    
    public void diseñarCasa(){
        
    }
    
    public void registrarse(){
        
    }
    
    public void CaracteristicaCasa(){
        
    }
    
    public void presupuestoCasaInical(){
        
    }
}
