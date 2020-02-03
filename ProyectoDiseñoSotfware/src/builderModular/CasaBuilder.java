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
public abstract class CasaBuilder {
    protected Casa casa;

    public Casa getCasa() {
        return casa;
    }

    public abstract void construirCasaEspecial();
    public abstract void definirAdicional();
    
    
    
    
}
