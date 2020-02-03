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
public class Nacional extends PisosPorcelanato{
    
    @Override
    public void adornar() {
        System.out.println("Se agrego piso Porcelanado Nacional a la casa");
    }
}
