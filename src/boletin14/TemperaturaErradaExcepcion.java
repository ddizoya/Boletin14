/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author ddizoya
 */
public class TemperaturaErradaExcepcion extends Exception{
   public TemperaturaErradaExcepcion(){
        super ("Recorda que a temperatura non pode ser < 80 ºC.");
    }
   public TemperaturaErradaExcepcion(String n){
         super(n);
     }
}
