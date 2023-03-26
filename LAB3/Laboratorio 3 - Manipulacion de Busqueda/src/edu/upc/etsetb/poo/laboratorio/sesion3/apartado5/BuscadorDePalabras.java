/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado5;

/**
 *
 * @author pol.lleida
 */
public class BuscadorDePalabras {

    public static void main(String[] args) {
        String string = "Escola Tecnica Superior Enginyeria Telecomunicacio Barcelona";
        String palabra = "Telecomunicacio";
        String[] palabras = string.split(" ");
        boolean palabraEncontrada = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
                palabraEncontrada = true;
            }
        }
        if (palabraEncontrada) {
            System.out.println("Palabra encontrada en el String");
        } else {
            System.out.println("Palabra no encontrada en el String");
        }
    }
}
