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
public class HistorialNavegacion {

    private static final int MAX_SIZE = 20;
    private String[] urls;
    private int numGuardadas;

    public HistorialNavegacion(int size) throws SizeException {
        if (size < 0 || size > MAX_SIZE) {
            throw new SizeException("Tamaño del historial de navegación incorrecto");
        }
        urls = new String[size];
        numGuardadas = 0;
    }

    public void guardarNueva(String url) {
        for (int i = numGuardadas - 1; i >= 0; i--) {
            if (i + 1 >= urls.length) {
                urls[i] = null;
            } else {
                urls[i + 1] = urls[i];
            }
        }
        urls[0] = url;
        if (numGuardadas < urls.length) {
            numGuardadas++;
        }
    }

    public void eliminarDeHistorial(String url) throws NoEncontradaException {
        boolean encontrada = false;
        for (int i = 0; i < numGuardadas; i++) {
            if (urls[i].equals(url)) {
                encontrada = true;
                for (int j = i; j < numGuardadas - 1; j++) {
                    urls[j] = urls[j + 1];
                }
                urls[numGuardadas - 1] = "";
            }
        }
        if (!encontrada) {
            throw new NoEncontradaException("URL no encontrada…");
        } else {
            System.out.println("URL eliminada satisfactoriamente");
        }
    }

    public String obtenerHistorialComoString() {
        String string = new String();
        for (String i : urls) {
            string += i;
            string += "\n";
        }
        return string;
    }
}
