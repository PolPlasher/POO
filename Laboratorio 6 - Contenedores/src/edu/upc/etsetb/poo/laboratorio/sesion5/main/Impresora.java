/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion5.main;

import java.util.LinkedList;

/**
 *
 * @author pol.lleida
 */
public class Impresora {

    private String nombre;
    private LinkedList<Trabajo> cola;

    public Impresora(String nombre) {
        this.nombre = nombre;
        this.cola = new LinkedList<Trabajo>();
    }

    public void addTrabajoEnCola(Trabajo trabajo) {
        this.cola.add(trabajo);
    }

    //  A partir de aqui no se yo que se
    public boolean procesaSiguienteTrabajo() {
        boolean vacia = cola.peek() == null;
        cola.removeFirst();
        return vacia;
    }
    
   /* public boolean priorizaTrabajoEnCola(int id) {

    }
    */
}
