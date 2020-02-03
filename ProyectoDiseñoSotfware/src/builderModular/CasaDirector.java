/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderModular;

import modelo.Casa;

/**
 *
 * @author Henry
 */
public class CasaDirector {

    protected CasaBuilder casaBuilder;

    public CasaDirector(CasaBuilder directorCasa) {
        this.casaBuilder = directorCasa;
    }

    public void construirCasa() {
        casaBuilder.construirCasaEspecial();
        casaBuilder.definirAdicional();
    }

    public Casa getCasa() {
        return casaBuilder.getCasa();
    }

}
