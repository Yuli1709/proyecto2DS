/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorador;

/**
 *
 * @author Tania
 */
public class AislanteTermico implements CasaInterfaz {

    @Override
    public void adornar() {
        System.out.println("Se agrego aislante termico a la casa");
    }
    
}
