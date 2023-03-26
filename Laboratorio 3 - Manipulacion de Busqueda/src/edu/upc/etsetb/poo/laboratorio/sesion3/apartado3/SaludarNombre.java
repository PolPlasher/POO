/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.laboratorio.sesion3.apartado3;

import java.util.Scanner;

/**
 *
 * @author pol.lleida
 */
public class SaludarNombre {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Com et dius? ");
        String text = lector.nextLine();
        System.out.println("Hola " + text + "!");
    }
}
