/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.hundirlaflota.dominio;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Juan Carlos Cruellas at Universidad Politécnica de Cataluña
 */
public class GeneradorDeFlotas {

    /**
     * Array invariable con los distintivos de los diferentes tipos de barco
     */
    private static final String[] ARRAY_TIPOS_BARCOS = { "P", "B", "S", "C", "L" };

    /**
     * Array invariable con los distintivos de las dos direcciones: horizontal
     * ("H") y vertical ("V")
     */
    private static final String[] ARRAY_DIRECCIONES = { "H", "V" };

    /**
     * Lista con los distintivos de los diferentes tipos de barcos
     */
    private static final List<String> TIPOS_BARCOS = Arrays.asList(GeneradorDeFlotas.ARRAY_TIPOS_BARCOS);

    /**
     * Lista con los distintivos de las dos direcciones
     */
    private static final List<String> DIRECCIONES = Arrays.asList(GeneradorDeFlotas.ARRAY_DIRECCIONES);

    /**
     * Constructor sin argumentos: no hace nada
     */
    public GeneradorDeFlotas() {
    }

    /**
     * Genera una flota determinista (ver descripción larga debajo).
     *
     * Genera la siguiente flota (siempre la misma)para el jugador pasado como
     * parámetro:
     * <ul>
     * <li>Lanchas en A6, D1, y J10</li>
     * <li>Cruceros en B10 dispuesto VERTICALMENTE, y en G9 dispuesto
     * HORIZONTALMENTE</li>
     * <li>Submarinos en B1 dispuesto HORIZONTALMENTE y en H1 dispuesto
     * HORIZONTALMENTE</li>
     * <li>Buque en G6 dispuesto VERTICALMENTE</li>
     * <li>Portaviones en E4 dispuesto HORIZONTALMENTE</li>
     * </ul>
     * Debe usar los métodos Barco::creaBbarco y Jugador::ponBarco.
     *
     * @param jugador el jugador para el que se crea la flota
     *
     * @throws PositionException si alguna posición en la que pretende dejarse
     *                           algún barco es incorrecta (no debería lanzarse si
     *                           todos los métodos están
     *                           bien diseñados e implementador)
     */
    public void generaFlotaDeterminista(Jugador jugador) throws PositionException {
        Barco barco = Barco.creaBarco("L", "Lancha");
        jugador.ponBarco(barco, "A6", "H");
        barco = Barco.creaBarco("L", "Lancha");
        jugador.ponBarco(barco, "D1", "H");
        barco = Barco.creaBarco("L", "Lancha");
        jugador.ponBarco(barco, "J1", "H");
        barco = Barco.creaBarco("C", "Crucero");
        jugador.ponBarco(barco, "B10", "V");
        barco = Barco.creaBarco("C", "Crucero");
        jugador.ponBarco(barco, "G9", "H");
        barco = Barco.creaBarco("S", "Submarino");
        jugador.ponBarco(barco, "B1", "H");
        barco = Barco.creaBarco("S", "Submarino");
        jugador.ponBarco(barco, "H1", "H");
        barco = Barco.creaBarco("B", "Buque");
        jugador.ponBarco(barco, "G6", "V");
        barco = Barco.creaBarco("P", "Portaviones");
        jugador.ponBarco(barco, "E4", "H");
    }

    /**
     * Crea y coloca un barco del tipo y con el nombre pasados como argumento en
     * una posición seleccionada aleatoriamente con el argumento random, para el
     * jugador pasado como argumento (ver descripción detallada debajo).
     *
     * El método:
     * <ol>
     * <li>Debe crear el barco del tipo pasado como argumento con el nombre
     * pasado como argumento (invocando a Barco.crea_barco).</li>
     * <li>Debe generar una fila entre 0 y 9 y una columna entre 1 y 10 usando
     * el objeto random pasado como argumento (método nextInt).</li>
     * <li>Debe generar un entero entre 0 y 1. Si es 0, la dirección del barco
     * será horizontal. Si es 1, será vertical.</li>
     * <li>Debe construir la coordenada a partir de la fila y la columna
     * generadas en el segundo paso. Si la fila es 0, entonces la letra de la
     * posición será 'A', y así sucesivamente.</li>
     * <li>Finalmente debe colocar el barco en esa posición y en la dirección
     * obtenidas (método Jugador::ponBarco ).</li>
     * </ol>
     *
     * @param jugador     el jugador para el que se creará y pondrá el barco
     *
     * @param tipoBarco   el tipo del barco a crear ("L": lancha, "C": crucero,
     *                    "S": submarino, "B": buque, "P": portaviones)
     *
     * @param nombreBarco el nombre del barco
     *
     * @param random      objeto Random para obtener enteros aleatoriamente
     */
    public void generaYPonBarco(Jugador jugador, String tipoBarco,
            String nombreBarco, Random random) {
        Barco barco = Barco.creaBarco(tipoBarco, nombreBarco);
        int fila = random.nextInt(10);
        int columna = random.nextInt(10) + 1;
        String direccion;
        if (random.nextInt(2) == 0)
            direccion = "H";
        else
            direccion = "V";
        String coordenada = Posicion.filaIntToFilaChar(fila) + Integer.toString(columna);
        try {
            jugador.ponBarco(barco, coordenada, direccion);
        } catch (PositionException e) {
        }
    }

    /**
     * Genera una flota aleatoria para el jugador pasado como argumento; debe
     * invocar al método generaYPonBarco() de esta misma clase.
     *
     * @param jugador el jugador para el que se generará la flota aleatoria
     */
    public void generaFlotaAleatoria(Jugador jugador) {
        // Dejad la siguiente línea: crea un objeto Random con una semilla
        // diferente para instantes que están separados más de 1 milisegundo
        Random random = new Random(System.currentTimeMillis());
        // Aquí debajo, eliminad la sentencia que crea y lanza la excepción
        // y sustituidla por vuestro código
        Barco barco;
        String direccion, posicion;
        for (int i = 0; i < 9; i++){
            if (random.nextInt(2) == 0)
                direccion = "H";
            else
                direccion = "V";
            posicion = Posicion.filaIntToFilaChar(random.nextInt(10)) + Integer.toString(random.nextInt(10) + 1);
            if (i < 3)
                barco = Barco.creaBarco("L", "Lancha");
            else if (i < 5)
                barco = Barco.creaBarco("C", "Crucero");
            else if (i < 7)
                barco = Barco.creaBarco("S", "Submarino");
            else if (i == 7)
                barco = Barco.creaBarco("B", "Buque");
            else
                barco = Barco.creaBarco("P", "Portaviones");
            try{
                jugador.ponBarco(barco, posicion, direccion);
            } catch (PositionException e){
                i--;
            }
        }
    }

    /**
     * Crea y deposita un barco del jugador pasado como argumento a partir de la
     * información contenida en la línea pasada como argumento (ver descripción
     * detallada debajo).
     *
     * Este método toma el argumento línea, la trocea en sus partes, comprueba
     * si su sintaxis es correcta y si es así crea un nuevo barco según las
     * indicaciones de esa línea. La línea debe responder al siguiente patrón:
     * <br>
     * &lt;TIPO_BARCO&gt; &lt;POSICION&gt; &lt;DISPOSICION DEL BARCO&gt;
     * &lt;NOMBRE DEL BARCO&gt;<br>
     * Donde:
     * <ul>
     * <li>&lt;TIPO_BARCO&gt; será una letra indicando el tipo de barco ("L":
     * lancha,
     * "C": crucero, "S": submarino, "B": buque, "P": portaviones).</li>
     * <li>&lt;POSICION&gt; será la posición de la casilla a partir de la cual
     * comenzará a depositarse el barco (A6, por ejemplo).</li>
     * <li>&lt;DISPOSICION DEL BARCO&gt; será un caracter que indicará si el barco
     * se
     * dispondrá horizontal (H) o verticalmente (V).</li>
     * <li>&lt;NOMBRE DEL BARCO&gt; será un string con el nombre del barco.</li>
     * </ul>
     * Ejemplo. La línea:
     * <br>
     * L A6 V Lancha_1
     * <br>
     * NOTA: Los 4 componentes están separados por un caracter blanco.
     * <br>
     * Ordenaría la creación de una LANCHA (L) conel nombre Lancha_1, y su
     * colocación en VERTICAL a partir de la casilla de posición A6.
     *
     * @param jugador el jugador para el que se genera el barco
     * @param linea   la línea con los datos
     * @param nLinea  el número de orden que la línea ocupa en el fichero
     * 
     * @throws ArchivoFlotaException si la línea cumple alguna de las siguientes
     *                               condiciones:
     *                               <ol>
     *                               <li>La línea no puede trocearse en 4
     *                               partes.</li>
     *                               <li>El primer caracter no blanco de la línea NO
     *                               se corresponde con ningún
     *                               indicativo de tipo de barco.</li>
     *                               <li>El valor de &lt;DISPOSICION DEL BARCO&gt;
     *                               no es ni 'H' ni 'V'.</li>
     *                               </ol>
     * 
     * @throws PositionException     si el barco debiera ocupar alguna posición
     *                               incorrecta
     */
    public void generaBarcoDeLinea(Jugador jugador, String linea, int nLinea)
            throws ArchivoFlotaException, PositionException {
        throw new UnsupportedOperationException(
                "GeneradorDeFlotas::generaBarcoDeLinea. Todavía NO has implementado este método");
    }

    /**
     * Lee una flota de un archivo (ver definición completa debajo).
     *
     * Este método abre el archivo cuyo nombre se pasa en el argumento
     * path_fichero, lee una a una sus líneas e invoca al método
     * generaBarcoDeLinea de esta misma clase para que genere un barco según el
     * contenido de esa línea. Cuando ha acabado de leer todas las líneas y de
     * invocar con todas ellas al método anterior, el método cierra el archivo.
     *
     * @param jugador     el jugador para el que se creará la flota
     *
     * @param pathFichero el nombre completo (pathname) del archivo de texto a
     *                    leer.
     *
     * @throws IOException           si hay una operación de apertura o lectura de
     *                               archivo
     *                               incorrecta.
     *
     * @throws ArchivoFlotaException si el archivo contiene algún error (ver
     *                               la especificación del método
     *                               generaBarcoDeLinea)
     *
     * @throws PositionException     si alguna posición de algún barco es incorrecta
     */
    public void leeFlotaDeArchivo(Jugador jugador, String pathFichero)
            throws IOException, ArchivoFlotaException, PositionException {
        throw new UnsupportedOperationException(
                "GeneradorDeFlotas::leeFlotaDeArchivo. Todavía NO has implementado este método");
    }
}
