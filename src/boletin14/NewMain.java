/*
 ** Está mal el trycatch
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author ddizoya
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
    
    try{
        conversor.centigradosAFharenheit();
    }
    catch(TemperaturaErradaExcepcion e){
        if(conversor.centigradosAFharenheit() >=80)
        JOptionPane.showMessageDialog(null,"ERRO" + e.toString());
    }
    finally{
        JOptionPane.showMessageDialog(null,"Fin do programa");
    }
    }
    
}
