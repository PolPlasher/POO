/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado4;

import java.util.Scanner;

/**
 *
 * @author pol.lleida
 */
public class GeneradorAcronimo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduzca frase: ");
        String string = lector.nextLine();
        String resultado = "";
        String[] palabras = string.split(" ");
        for (String palabra : palabras) {
            resultado += palabra.charAt(0);
        }
        System.out.println("Las iniciales del String son : " + resultado);
    }
}
