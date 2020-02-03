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
public class Casa {
    protected double metrosCuadrados;
    protected int numeroPlantas;
    protected boolean esquinera;
    protected Orientacion orientacion;
    protected boolean patioGrande;
    protected int numeroHabitacion;
    protected int numeroBaños;
    protected Adicional adicional;
    protected double precio;
    protected String rutaImagen;

    public Casa() {
    }

    public Casa(double metrosCuadrados, int numeroPlantas, boolean esquinera, Orientacion orientacion, boolean patioGrande, int numeroHabitacion, int numeroBaños, Adicional adicional, double precio, String rutaImagen) {
        this.metrosCuadrados = metrosCuadrados;
        this.numeroPlantas = numeroPlantas;
        this.esquinera = esquinera;
        this.orientacion = orientacion;
        this.patioGrande = patioGrande;
        this.numeroHabitacion = numeroHabitacion;
        this.numeroBaños = numeroBaños;
        this.adicional = adicional;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
    }

  
    public Casa(double metrosCuadrados, int numeroPlantas, boolean esquinera, Orientacion orientacion, boolean patioGrande, int numeroHabitacion, int numeroBaños, Adicional adicional, double precio) {
        this.metrosCuadrados = metrosCuadrados;
        this.numeroPlantas = numeroPlantas;
        this.esquinera = esquinera;
        this.orientacion = orientacion;
        this.patioGrande = patioGrande;
        this.numeroHabitacion = numeroHabitacion;
        this.numeroBaños = numeroBaños;
        this.adicional = adicional;
        this.precio = precio;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getNumeroPlantas() {
        return numeroPlantas;
    }

    public void setNumeroPlantas(int numeroPlantas) {
        this.numeroPlantas = numeroPlantas;
    }

    public boolean isEsquinera() {
        return esquinera;
    }

    public void setEsquinera(boolean esquinera) {
        this.esquinera = esquinera;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public boolean isPatioGrande() {
        return patioGrande;
    }

    public void setPatioGrande(boolean patioGrande) {
        this.patioGrande = patioGrande;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public Adicional getAdicional() {
        return adicional;
    }

    public void setAdicional(Adicional adicional) {
        this.adicional = adicional;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    
    
}
