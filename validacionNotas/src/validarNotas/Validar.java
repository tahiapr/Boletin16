/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarNotas;

import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class Validar {
    public static float comprobarNota (float nota){
        while (nota<0 || nota>10){
        nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca bien la nota"));
        }
    return nota;
    }
    
    public static int comprobarBoletines (int boletines) {
         while (boletines<0 || boletines>17){
        boletines = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca bien el número de boletines"));
        }
        return boletines;
        
    }
}
