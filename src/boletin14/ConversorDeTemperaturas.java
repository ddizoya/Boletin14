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
public class ConversorDeTemperaturas {

private final int GRAOS =80;

    public int getGRAOS() {
        return GRAOS;
    }



public float centigradosAFharenheit() throws TemperaturaErradaExcepcion{
float r = Float.parseFloat(JOptionPane.showInputDialog("Introduce os graos centígrados."));
float farenheit = (float) (9.0/5.0*r + 32.4);
return farenheit;
    
}   
}
