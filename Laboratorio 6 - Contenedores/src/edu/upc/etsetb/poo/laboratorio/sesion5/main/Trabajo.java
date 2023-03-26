/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.laboratorio.sesion5.main;

/**
 *
 * @author pol.lleida
 */
public class Trabajo {

    private int id;
    private String usuario, descripcion;

    public Trabajo(int id, String usuario, String descripcion) {
        this.id = id;
        this.usuario = usuario;
        this.descripcion = descripcion;
    }

    public int getId() {
        return this.id;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String toString() {
        return "ID: " + this.id + " [" + this.usuario + "]: " + this.descripcion;
    }
}
