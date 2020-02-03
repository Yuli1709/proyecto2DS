/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderModular;

import modelo.Casa;
import modelo.Orientacion;

/**
 *
 * @author Henry
 */
public class Paraiso_Builder extends CasaBuilder{

    @Override
    public void construirCasaEspecial() {
        casa = new Casa();
        casa.setNumeroHabitacion(3);
        casa.setNumeroBaños(2);
        casa.setNumeroPlantas(1);
        casa.setPatioGrande(true);
        casa.setOrientacion(Orientacion.Oeste);
        casa.setMetrosCuadrados(180);
        casa.setPrecio(24000.00);
        casa.setRutaImagen("src\\imagenes\\casa3.PNG");
    }

    @Override
    public void definirAdicional() {
    }
    
    
}
