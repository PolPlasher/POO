/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion5.ej3.test;

import edu.upc.etsetb.poo.laboratorio.sesion5.ej3.HistorialNavegacion;
import edu.upc.etsetb.poo.laboratorio.sesion5.ej3.NoEncontradaException;
import edu.upc.etsetb.poo.laboratorio.sesion5.ej3.SizeException;

/**
 *
 * @author pol.lleida
 */
public class HistorialNavegacionTest {

    public static void main(String[] args) throws SizeException, NoEncontradaException {

        HistorialNavegacion historial = new HistorialNavegacion(5);
        historial.guardarNueva("https://www.upc.edu/ca");
        historial.guardarNueva("https://telecos.upc.edu/ca");
        historial.guardarNueva("https://atenea.upc.edu/login/index.php");
        historial.guardarNueva("https://scholar.google.es/");
        historial.guardarNueva("https://stackoverflow.com/");

        System.out.println("1:\n-----------------------------------\n" + historial.obtenerHistorialComoString());

        historial.guardarNueva("https://netbeans.apache.org/");
        historial.guardarNueva("https://openjdk.org/");

        System.out.println("2:\n-----------------------------------\n" + historial.obtenerHistorialComoString());

        historial.eliminarDeHistorial("https://netbeans.apache.org/");

        System.out.println("3:\n-----------------------------------\n" + historial.obtenerHistorialComoString());
    }
}
