/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.laboratorio.sesion5.ej1;

/**
 *
 * @author pol.lleida
 */
public class CodigoConflictivo {

    public static void main(String[] args) {

        /*
        String s1 = null, s2 = "No es pot fer toUpperCase si el String es null";
        s1 = "Hola";
        s2 = s2.toUpperCase(); // No es pot fer toUpperCase a un String null
        System.out.println(s2);
         */
 /*
        String texto = "Palabra1,Palabra2,Palabra3";
        String[] palabras = texto.split(",");
        String ultimaPalabraMayusculas = palabras[2].toUpperCase(); // La posició 3 del array no esta definida per tant no es pot retornar, es important recordar que es comença a contar des del zero.
        System.out.println(ultimaPalabraMayusculas);
         */
 /*
        int i;
        int[] valores = {3, 4, 7, 9, 15};
        for (i = 1; i < valores.length / 2; i++) {  // La i comença a 0, lo que fa que s'accedeixi a la posició 5 de valores [linea 32], que no esta definida
            int aux = valores[i];
            valores[i] = valores[valores.length - i];
            valores[valores.length - i] = aux;
        }
        /*
        for (i = 0; i < valores.length - 1; i++) { // En aquest rang la i ha de ser mes petita que valores.length - 1 NO IGUAL perquè es passaria el limit, donant un error ArrayIndexOutOfBoundsException
            System.out.print(valores[i] + ",");
        }
        System.out.println(valores[i]);
         */
    }
}
