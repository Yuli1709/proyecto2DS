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
public class Cielo_Builder extends CasaBuilder{

    @Override
    public void construirCasaEspecial() {
        casa = new Casa();
        casa.setNumeroHabitacion(4);
        casa.setNumeroBaños(3);
        casa.setNumeroPlantas(2);
        casa.setPatioGrande(true);
        casa.setMetrosCuadrados(200.00);
        casa.setPrecio(30000.00);
        casa.setOrientacion(Orientacion.Norte);
    }

    @Override
    public void definirAdicional() {
    }
    
    
}
