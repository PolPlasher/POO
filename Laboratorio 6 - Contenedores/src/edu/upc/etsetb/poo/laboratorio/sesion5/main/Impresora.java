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
        this.cola = new LinkedList<>();
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

    public boolean priorizaTrabajoEnCola(int id) {
        boolean trabajoEncontrado = false;
        for (Trabajo i : cola) {
            if (i.getId() == id) {
                trabajoEncontrado = true;
                cola.addFirst(i);
                cola.remove(i);
            }
        }
        return trabajoEncontrado;
    }

    public void limitaLongitudCola(int maxTrabajos) {
        for (int i = maxTrabajos; i < cola.size(); i++) {
            cola.remove(i);
        }
    }

    public String toString() {
        String info = "Impresora: " + this.nombre + "\nTrabajos actualmente en cola:\n";
        for (int i = 0; i < cola.size(); i++) {
            info += cola.get(i).toString();
        }
        return info;
    }
}
