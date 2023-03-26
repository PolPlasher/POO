/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.laboratorio.sesion5.ej3;

/**
 *
 * @author pol.lleida
 */
public class SizeException extends Exception {

    /**
     * Creates a new instance of <code>SizeException</code> without detail
     * message.
     */
    public SizeException() {
    }

    /**
     * Constructs an instance of <code>SizeException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public SizeException(String msg) {
        super(msg);
    }
}
