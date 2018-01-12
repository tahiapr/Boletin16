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
public class Academica {
                 
    
    private static int numReferencia=2018;
    private String nome;
    private Notas nota;
    private Persoal alum;

    public Academica(String nome, Notas nota, Persoal alum) {
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
        numReferencia++;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(Notas nota) {
        this.nota = nota;
    }

    public Notas getNota() {
        return nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Número referencia: "+numReferencia+ "\nNome: " + nome + "\nNota: " + nota.getNotaFinal() + "\nDATOS ALUMNO" + alum;
    }
    
    
}
