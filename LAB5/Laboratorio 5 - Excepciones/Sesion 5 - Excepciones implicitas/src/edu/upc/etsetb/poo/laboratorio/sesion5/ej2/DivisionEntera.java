/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.laboratorio.sesion5.ej2;

import java.util.Scanner;

/**
 *
 * @author pol.lleida
 */
public class DivisionEntera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean errorFormato;
        boolean errorAritmetico;
        int divisor;
        int cociente;
        int residuo;
        
        do {
            errorFormato = false;
            errorAritmetico = false;
            try {
                System.out.print("Introduce el dividendo: ");
                int dividendo = Integer.parseInt(scanner.nextLine());
                System.out.print("Introduce el divisor: ");
                divisor = Integer.parseInt(scanner.nextLine());
                cociente = dividendo / divisor;
                residuo = dividendo % divisor;
                System.out.println("El cociente de la division entera es: " + cociente);
                System.out.println("El residuo de la division entera es: " + residuo);
            } catch (NumberFormatException e) {
                errorFormato = true;
                System.out.println("No es un valor entero, vuelve a intentarlo");
            } catch (ArithmeticException e) {
                errorAritmetico = true;
                System.out.println("Parece ser una division por 0...");
            }
        } while (errorFormato);
    }
}
