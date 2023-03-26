/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.ordenacion.aleatorio;

/**
 *
 * @author pol.lleida
 */
public class OrdenaInsercion {

    public static void main(String args[]) {

        // INSERTAR aquí el código que declara, crea e inicializa convenientemente el array de enteros
        int[] array = {30, 15, 2, 21, 44, 8};

        //INSERTAR aquí el código que muestre por pantalla el contenido del array sin ordenar
        print_array(array);

        //INSERTAR el código que implementa el algoritmo de inserción directa
        for (int i = 1; i < array.length; i++) {
            int temp = array[i], j;
            for (j = i; j > 0 && array[j - 1] > temp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }

        //INSERTAR aquí el código que muestre por pantalla el contenido del array ordenado
        print_array(array);
    }

    public static void print_array(int[] array) {
        int i;
        System.out.print("{");
        for (i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[i] + "}");
    }
}
