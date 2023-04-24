package laberint.model;

import java.util.TreeMap;
import java.util.Iterator;
import laberint.excepcions.LaberintException;

/** Atributs i mètodes de l'Aventurer. */
public class Adventurer {

    
    private Room currentLocation;
    private int encumbrance;
    private Treemap<String, Item> inventory;
    /** Càrrega màxima que pot suportar l'aventurer. */
    private static final int MAX_ENCUMBRANCE = 15;
    private final String name;


    //  Constructor
    public Adventurer(String name, Room startLocation) {
        this.name = name;
        this.currentLocation = startLocation;
    }

    //  Fa que l'aventurer deixi caure un item (l'item s'extreu de l'inventari i s'afegeix a la sala actual).
    public void drop(String itemName) {

    }

    //  Obté la ubicació actual de l'aventurer.
    public Room getCurrentLocation() {
        return 0;
    }

    /** Retorna un String amb les dades de tots els items de l'inventari de l'aventurer.
     * @return Iterador.
     */
    public String inventoryToString() {
        String text = "";
        Iterator<Item> itItems = this.inventory.values().iterator();
        if (itItems.hasNext() == false) {
            text = "No tens cap item.\n";
        } else {
            while (itItems.hasNext()) {
                Item item = itItems.next();
                text += item.toString() + "\n";
            }
        }
        return text;
    }

    //  Fa que l'aventurer es mogui cap a una de les sortides de la sala actual.
    public void move(String exitName) {
        
    }

    //  Fa que l'aventurer agafi un item.
    public void pickUp(String itemName) {
        
    }
}