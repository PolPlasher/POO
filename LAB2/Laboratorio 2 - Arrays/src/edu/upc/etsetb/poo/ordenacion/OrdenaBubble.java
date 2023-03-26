/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.ordenacion;

/**
 *
 * @author pol.lleida
 */
public class OrdenaBubble {

    public static void main(String[] args) {

        int[] array = {30, 15, 2, 21, 44, 8};
        print_array(array);

        for (int i = array.length - 1; i > 0; i--) {
            
            for (int j = 0; j < i; j++) {
                int temp;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
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
