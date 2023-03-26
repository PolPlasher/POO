/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado1;

/**
 *
 * @author pol.lleida
 */
public class InvertirCadena {

    public static void main(String[] args) {

        String string = "Escola Tecnica Superior Enginyeria Telecomunicacio Barcelona";
        String invertidoMinuscula = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            invertidoMinuscula += string.charAt(i);
        }
        invertidoMinuscula = invertidoMinuscula.toLowerCase();
        System.out.println("String original: " + string + "\nString invertido y en minusculas: " + invertidoMinuscula);
    }
}
