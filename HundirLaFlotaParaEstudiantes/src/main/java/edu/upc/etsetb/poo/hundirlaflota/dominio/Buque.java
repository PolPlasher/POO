/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.hundirlaflota.dominio;

/**
 *
 * @author Juan Carlos Cruellas at Universidad Politécnica de Cataluña
 */
public class Buque extends Barco {

    /**
     * Inicializa el buque.
     *
     * Inicializa el atributo nom el valor del argumento. Inicializa el atributo
     * lon a 4. Crea posiciones como una lista vacía, crea el conjunto
     * posTocadas como un conjunto vacío y hundido a false.
     *
     * @param nombre el nombre del barco.
     */
    public Buque(String nombre) {
        super(nombre, 4);
    }
}
