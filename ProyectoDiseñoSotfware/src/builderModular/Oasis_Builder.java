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
public class Oasis_Builder extends CasaBuilder{

    @Override
    public void construirCasaEspecial() {
        casa = new Casa();
        casa.setNumeroHabitacion(2);
        casa.setNumeroBaños(2);
        casa.setNumeroPlantas(2);
        casa.setPatioGrande(false);
        casa.setMetrosCuadrados(150);
        casa.setOrientacion(Orientacion.Sur);
        casa.setPrecio(18000.00);
    }

    @Override
    public void definirAdicional() {
    }
    
    
}
