/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;

import javax.swing.JOptionPane;
import validarNotas.Validar;
/**
 *
 * @author tperezrodriguez
 */
public class Notas {
    private float pruebaEscrita;
    private float pruebaPractica;
    private float boletines;
    private float notaFinal;

    public Notas() {
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void calcularEscrita (float examen1, float examen2){
        float media = (examen1 + examen2)/2;
        float porcentaje = (media * 4)/10;
        pruebaEscrita = porcentaje;
    }
    
    public void calcularPractica (float examen){
        float porcentaje = (examen * 4)/10;
        pruebaPractica = porcentaje;
    }
    
    public void calcularBoletines (int numBoletines){
       float porcentaje = (numBoletines * 100)/17;
       
       if (porcentaje > 90){
           boletines = 2; 
       } else if (porcentaje <=90 && porcentaje >=70){
           boletines = 1;
       } else {
           boletines = 0;
      }
    }
    
    public void calcularNota() {
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca nota examen teórico 1"));
        nota1= Validar.comprobarNota(nota1);
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca nota examen teórico 2"));
        nota2= Validar.comprobarNota(nota2);
        this.calcularEscrita(nota1, nota2);


        float nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca nota examen práctico"));
        nota3=Validar.comprobarNota(nota3);
        this.calcularPractica(nota3);
        

        int nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca número boletines hechos"));
        nota4=Validar.comprobarBoletines(nota4);
        this.calcularBoletines(nota4);

        this.calcularNotaFinal();
    }

    public void calcularNotaFinal (){
        notaFinal = pruebaEscrita + pruebaPractica + boletines;
    }
    
    public void mostrarNotas (){
        System.out.println("PROBAS TEÓRICAS……………"+pruebaEscrita +"\n" +
            "PROBAS PRÁCTICA……………"+pruebaPractica+"\n" +
            "BOLETÍNS  ………………………."+boletines +"\n" +
            "NOTA TOTAL……………………"+notaFinal);
    }
}
