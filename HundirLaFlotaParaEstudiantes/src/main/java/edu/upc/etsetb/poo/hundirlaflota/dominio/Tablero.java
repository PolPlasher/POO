/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.hundirlaflota.dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Juan Carlos Cruellas at Universidad Politécnica de Cataluña
 */
public class Tablero {

    /**
     * Atributo casillas: mapa con Strings (las posiciones en el tablero) como
     * claves y objetos Barco (los barcos que ocupan las anteriores posiciones)
     * como valores
     */
    private Map<String, Barco> casillas;

    /**
     * Atributo disparosAAgua: lista de Strings; cada string es un disparo
     * realizado al agua sobre la flota del jugador que posee este tablero
     */
    private List<String> disparosAAgua;

    /**
     * Inicializa el barco.
     *
     * Crea el mapa casillas como un mapa vacío y la lista disparosAAgua como
     * una lista vacía
     */
    public Tablero() {
        casillas = new HashMap<>();
        disparosAAgua = new ArrayList<>();
    }

    /**
     * Devuelve el barco que está en la posición pasada como argumento, o null
     * si no lo hay.
     *
     * @param pos string identificando la posición ("A6" por ejemplo).
     *
     * @return el barco que está en esa posición o null si no hay ningún barco
     *         en ella.
     */
    public Barco getBarcoEn(String pos) {
        return casillas.get(pos);
    }

    /**
     * Devuelve el conjunto de las posiciones en las que hay barcos (claves del
     * atributo casillas).
     *
     * @return el conjunto de la lista de las claves del mapa casillas
     */
    public Set<String> getPosicionesBarcos() {
        return casillas.keySet();
    }

    /**
     * Get the value of disparosAlAgua
     *
     * @return the value of disparosAlAgua
     */
    public List<String> getDisparosAAgua() {
        return disparosAAgua;
    }

    /**
     * Get the value of casillas
     *
     * @return the value of casillas
     */
    public Map<String, Barco> getCasillas() {
        return casillas;
    }

    /**
     * Set the value of casillas
     *
     * @param casillas new value of casillas
     */
    public void setCasillas(Map<String, Barco> casillas) {
        this.casillas = casillas;
    }

    /**
     * Intenta poner un barco en una posición y con una dirección indicados en
     * los correspondientes argumentos.
     *
     * El método debe:
     * <ol>
     * <li>Comprobar que ninguna de las casillas que ocupará el barco contacta
     * con algún otro barco en el tablero</li>
     * <li>Si no hay contacto debe calcular el conjunto de posiciones del barco,
     * asignarlo al atributo posiciones_barco del barco y crear las parejas
     * (posición, barco) en el mapa casillas</li>
     * </ol>
     *
     * @param barco     el barco que quiere ponerse en el tablero
     *
     * @param posicion  la posición a partir de la cual quiere depositarse el
     *                  barco ("A6", por ejemplo)
     *
     * @param direccion "H" (horizontal) o "V" (vertical).
     *
     * @throws PositionException si alguna de las posiciones no es correcta o si
     *                           alguna de las posiciones contacta on algún barco.
     */
    public void ponBarco(Barco barco, String posicion, String direccion)
            throws PositionException {
        Posicion.checkNoContactaConOtro(posicion, barco.getLon(), direccion, this);
        ArrayList<String> posiciones = new ArrayList<>();
        String posicionActual;
        if (posicion.equals("H")) {
            for (int i = 0; i < barco.getLon(); i++) {
                posicionActual = Posicion.avanzaCasillas(posicion, 0, i);
                posiciones.add(posicionActual);
                casillas.put(posicionActual, barco);
            }
        } else if (posicion.equals("V")) {
            for (int i = 0; i < barco.getLon(); i++) {
                posicionActual = Posicion.avanzaCasillas(posicion, i, 0);
                posiciones.add(posicionActual);
                casillas.put(posicionActual, barco);
            }
        }
        barco.setPosiciones(posiciones);
    }

    /**
     * Añade al atributo disparosAAgua la posición pasada como argumento.
     *
     * @param pos un string identificando la posición.
     */
    public void anotaAguaEnHumano(String pos) {
        disparosAAgua.add(pos);
    }

    /**
     * Devuelve el contenido de la casilla que ocupa la posición indicada
     * en el argumento pos.
     *
     * @return el contenido de la casilla que ocupa la posición indicada en el
     *         argumento pos (un barco o null si no hay ningún barco en esa
     *         casilla).
     * 
     * @param pos la posición de la casilla
     */
    public Barco getContenidoCasilla(String pos) {
        return getBarcoEn(pos);
    }
}