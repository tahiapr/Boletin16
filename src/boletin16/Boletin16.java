/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;

import datos.Persoal;

/**
 *
 * @author tperezrodriguez
 */
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoal pers = new Persoal("blabla@icloud.com", "67789983");
        Notas nota = new Notas ();
        nota.calcularNota();
        Academica aca = new Academica ("Lola", nota, pers);
        System.out.println(aca.toString());
        
        
        
    }
    
}
