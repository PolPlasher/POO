/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.hundirlaflota.dominio;

import java.util.Map;

/**
 *
 * @author Juan Carlos Cruellas at Universidad Politécnica de Cataluña
 */
public class JugadorHumano extends Jugador {

    /**
     * Visor de ataque del jugador humano
     */
    private Map<String, String> visorDeAtaque;

    /**
     * Inicializa el jugador.
     *
     * <br>Inicializa el atributo numBarcosHundidos a 0.
     * <br>Crea un tablero.
     * <br>Inicializa el atributo nombre al argumento nombre.
     * <br>Crea visor_ataque como un mapa vacío.
     *
     * @param nombre el nombre del barco.
     */
    public JugadorHumano(String nombre) {
        super(nombre);
        throw new UnsupportedOperationException("JugadorHumano::JugadorHumano. Todavía NO has implementado este método");
    }

    /**
     * Get the value of visorDeAtaque
     *
     * @return the value of visorDeAtaque
     */
    @Override
    public Map<String, String> getVisorDeAtaque() {
        throw new UnsupportedOperationException("JugadorHumano::getVisorDeAtaque. Todavía NO has implementado este método");
    }

    /**
     * Devuelve siempre el string "ASK_USER"
     *
     *
     * @return devuelve siempre el string "ASK_USER"
     */
    @Override
    public String dispara() {
        throw new UnsupportedOperationException("JugadorHumano::dispara. Todavía NO has implementado este método");
    }

    /**
     * Devuelve siempre true
     * @return true
     */
    @Override
    public boolean eresHumano() {
        throw new UnsupportedOperationException("JugadorHumano::eresHumano. Todavía NO has implementado este método");
    }
    
    /**
     * Devuelve siempre el string "ASK_USER"
     *
     *
     * @return devuelve siempre el string "ASK_USER"
     */
    @Override
    public String procesaTocado(String posDisparo) throws PositionException {
        throw new UnsupportedOperationException("JugadorHumano::procesaTocado. Todavía NO has implementado este método");
    }
    
    /**
     * Devuelve siempre el string "ASK_USER"
     *
     *
     * @return devuelve siempre el string "ASK_USER"
     */
    @Override
    public String procesaHundido(String posDisparo, int numTotalBarcos) {
        throw new UnsupportedOperationException("JugadorHumano::procesaHundido. Todavía NO has implementado este método");
    }

    /**Anota el resultado pasado como argumento al disparar a la posición 
     * pasada como argumento, en el visor de ataque del jugador.
    *
    * @param posDisparo   la posición a la que el jugador ha disparado
    * @param resultado   el resultado del disparo (Jugador.AGUA, Jugador.TOCADO 
    * o Jugador.HUNDIDO)
    */
    @Override
    public void anotaDisparoPropio(String posDisparo, String resultado) {
        throw new UnsupportedOperationException("JugadorHumano::anotaDisparoPropio. Todavía NO has implementado este método");
    }

    /**
     * Anota el resultado del disparo del adversario en el tablero de este
     * jugador humano.
     *
     * Si el resultado es agua, hay que anotar agua en humano en el tablero. Si
     * no es así, hay que obtener elbarco y añadir la posición al conjunto de
     * posiciones tocadas del barco tocado o hundido.\n
     *
     * Debe usar los métodos Tablero::anotaAguaEnHumano, Tablero::getBarcoEn y
     * Barco::addPosicionTocada.
     *
     * @param posDisparo la posición a la que el adversario ha disparado
     * @param resultado el resultado del disparo (Jugador.AGUA, Jugador.TOCADO o
     * Jugador.HUNDIDO)
     */  
    @Override
    public void anotaDisparoAjeno(String posDisparo, String resultado) {
        throw new UnsupportedOperationException("JugadorHumano::anotaDisparoAjeno. Todavía NO has implementado este método");
    }

        /**Retorna true si el usuario ya ha disparado antes a la posición 
         * pasada como argumento (puede usarse el visor
    * de disparos para averiguarlo); retorna false en caso contrario.
    *
    * @param    posicion  la posición a la que dispara el jugador.
    * @return   true si el usuario ya ha disparado antes a la posición pasada 
    * como argumento; false en caso contrario
    */
    public boolean hasDisparadoAquiAntes(String posicion){
        throw new UnsupportedOperationException("JugadorHumano::hasDisparadoAquiAntes. Todavía NO has implementado este método");
    }
}
