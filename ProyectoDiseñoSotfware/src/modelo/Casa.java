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
    
    
    
}
