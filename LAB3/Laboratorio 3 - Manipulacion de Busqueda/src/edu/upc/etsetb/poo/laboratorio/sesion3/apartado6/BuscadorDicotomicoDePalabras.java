/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado6;

/**
 *
 * @author pol.lleida
 */
public class BuscadorDicotomicoDePalabras {

    public static void main(String[] args) {

        String frase = "Enginyeria Escola Superior Tecnica Telecomunicacio";
        String solucion = "Tecnica";
        String[] array = frase.split(" ");
        boolean palabra_encontrada = false;

        int primera = 0, ultima = array.length, centro = 0;
        while (primera <= ultima) {
            centro = (primera + ultima) / 2;
            if (centro >= array.length) {
                palabra_encontrada = false;
                break;
            }
            int ref = array[centro].compareTo(solucion);
            if (ref == 0) {
                palabra_encontrada = true;
                break;
            } else if (ref < 0) {
                primera = centro + 1;
            } else {
                ultima = centro - 1;
            }
        }
        if (palabra_encontrada) {
            System.out.println("Palabra encontrada en la posicion " + centro);
        } else {
            System.out.println("Palabra no encontrada");
        }
    }
}
