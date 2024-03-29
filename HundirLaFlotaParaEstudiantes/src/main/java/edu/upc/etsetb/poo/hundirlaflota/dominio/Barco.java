/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.hundirlaflota.dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Juan Carlos Cruellas at Universidad Politécnica de Cataluña
 */
public class Barco {

    /**
     * Nombre del barco
     */
    private String nombre;

    /**
     * Número de casillas que ocupa el barco
     */
    private int lon;

    /**
     * Booleano que indica si el barco está hundido o no
     */
    private boolean hundido;

    /**
     * Lista de posiciones que ocupa el barco sobre el tablero
     */
    private List<String> posiciones;

    /**
     * Lista de posisiciones del barco que han sido tocadas por disparos del
     * adversario
     */
    private Set<String> posicionesTocadas;

    /**
     * Constructor que inicializa el barco.
     *
     * Inicializa los atributos nombre y lon con los valores de los respectivos
     * argumentos. Crea posiciones como una lista vacía, crea el conjunto
     * posicionesTocadas como un conjunto vacío, e inicializa hundido a false.
     *
     * @param nombre el nombre del barco.
     * @param lon    el número de casillas que ocupa el barco en el tablero.
     */
    protected Barco(String nombre, int lon) {
        this.nombre = nombre;
        this.lon = lon;
        posiciones = new ArrayList<>();
        posicionesTocadas = new HashSet<>();
        hundido = false;
    }

    /**
     * Método para "fabricar" barcos (ver descripción debajo en especificación
     * detallada).
     *
     * Crea un nuevo barco de un tipo específico a partir de sus argumentos:
     * <ul>
     * <li>Si tipo en mayúsculas es "L", crear una lancha con el nombre y
     * devolverla.</li>
     * <li>Si tipo en mayúsculas es "C", crear un crucero con el nombre y
     * devolverlo.</li>
     * <li>Si tipo en mayúsculas es "S", crear un submarino con el nombre y
     * devolverlo.</li>
     * <li>Si tipo en mayúsculas es "B", crear un buque con el nombre y
     * devolverlo.</li>
     * <li>Si tipo en mayúsculas es "P", crear un portaviones con el nombre y
     * devolverlo.</li>
     * <li>Si tipo NO es ninguno de los anteriores, crear una lancha con el
     * nombre y devolverla.</li>
     * </ul>
     *
     * @param tipo   un string de un caracter indicativo del tipo de barco que hay
     *               que "fabricar".\n
     * @param nombre el nombre del barco.
     * @return el barco creado
     */
    public static Barco creaBarco(String tipo, String nombre) {
        Barco barco;
        switch (tipo.toUpperCase()) {
            case "L":
                barco = new Lancha(nombre);
                break;
            case "C":
                barco = new Crucero(nombre);
                break;
            case "S":
                barco = new Submarino(nombre);
                break;
            case "B":
                barco = new Buque(nombre);
                break;
            case "P":
                barco = new Portaviones(nombre);
                break;
            default:
                barco = new Barco(nombre, 1);
                break;
        }
        return barco;
    }

    /**
     * Devuelve la longitud del tipo de barco pasado como argumento (ver
     * descripción debajo en especificación detallada).
     *
     * Devuelve la longitud del tipo indicado por su argumento:
     * <ul>
     * <li>Si tipo en mayúsculas es "L", devuelve 1.</li>
     * <li>Si tipo en mayúsculas es "C", devuelve 2.</li>
     * <li>Si tipo en mayúsculas es "S", devuelve 3.</li>
     * <li>Si tipo en mayúsculas es "B", devuelve 4.</li>
     * <li>Si tipo en mayúsculas es "P", devuelve 5.</li>
     * </ul>
     *
     * @param tipo un string de un caracter indicativo del tipo de barco cuya
     *             longitud hay que devolver.
     * 
     * @return la longitud del tipo de barco pasado como argumento
     */

    public static int getLongitudDeTipoDeBarco(String tipo) {
        int lon = 0;
        switch (tipo.toUpperCase()) {
            case "L":
                lon = 1;
                break;
            case "C":
                lon = 2;
                break;
            case "S":
                lon = 3;
                break;
            case "B":
                lon = 4;
                break;
            case "P":
                lon = 5;
                break;
        }
        return lon;
    }

    /**
     *
     * @param pos
     */
    /**
     * Añade una posición al conjunto de posiciones tocadas del barco.
     *
     * Añade una posición al conjunto de posiciones tocadas del barco. Si esta
     * es la última posición que quedaba por tocar del barco, asigna al atributo
     * hundido el valor true.
     *
     * @param pos la posición del barco a añadir al conjunto
     *
     */
    public void addPosicionTocada(String pos) {
        posicionesTocadas.add(pos);
        if (posicionesTocadas.size() == lon)
            hundido = true;
    }

    /**
     * Get the value of posiciones
     *
     * @return the value of posiciones
     */
    public List<String> getPosiciones() {
        return posiciones;
    }

    /**
     * Get the value of posicionesTocadas
     *
     * @return the value of posicionesTocadas
     */
    public Set<String> getPosicionesTocadas() {
        return posicionesTocadas;
    }

    /**
     * Set the value of posiciones
     *
     * @param posiciones new value of posiciones
     */
    public void setPosiciones(List<String> posiciones) {
        this.posiciones = posiciones;
    }

    /**
     * Get the value of hundido
     *
     * @return the value of hundido
     */
    public boolean isHundido() {
        return hundido;
    }

    /**
     * Get the value of lon
     *
     * @return the value of lon
     */
    public int getLon() {
        return lon;
    }

    /**
     * Indica si, al ser tocado en la posición pasada como argumento, el barco
     * se hundirá o no.
     *
     * Añade la posición a la lista de posiciones tocadas del barco; si la lista
     * contiene todas las posiciones que ocupaba el barco en el tablero,
     * devuelve true; en caso contrario, devuelve false.
     *
     * @param pos la posición a la que se ha disparado y que ha tocado en el
     *            barco.
     *
     * @return true si después de añadir la posición a la lista de posiciones
     *         tocadas, dicha lista contiene todas las posiciones que ocupaba el
     *         barco;
     *         false en caso contrario.
     */
    public boolean hundiraEsteTocado(String pos) {
        this.addPosicionTocada(pos);
        return hundido;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + this.lon;
        hash = 89 * hash + (this.hundido ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.posiciones);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barco other = (Barco) obj;
        if (this.lon != other.lon) {
            return false;
        }
        if (this.hundido != other.hundido) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.posiciones, other.posiciones)) {
            return false;
        }
        return Objects.equals(this.posicionesTocadas, other.posicionesTocadas);
    }

}
