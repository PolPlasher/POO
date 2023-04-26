package laberint.model;

import java.util.TreeMap;
import java.util.Iterator;
import laberint.excepcions.LaberintException;

/** Atributs i mètodes de l'Aventurer. */
public class Adventurer {

    private Room currentLocation;
    private int encumbrance;
    private TreeMap<String, Item> inventory;
    /** Càrrega màxima que pot suportar l'aventurer. */
    private static final int MAX_ENCUMBRANCE = 15;
    private final String name;

    public Adventurer(String name, Room startLocation) {
        this.name = name;
        this.currentLocation = startLocation;
        inventory = new TreeMap<>();
    }

    // Fa que l'aventurer deixi caure un item (l'item s'extreu de l'inventari i
    // s'afegeix a la sala actual).
    public void drop(String itemName) throws LaberintException {
        if (!inventory.containsKey(itemName))
            throw new LaberintException("No disposes de cap item amb aquest nom.");
        encumbrance -= inventory.get(itemName).getEncumbrance();
        inventory.remove(itemName);
    }

    public Room getCurrentLocation() {
        return currentLocation;
    }

    public String getName() {
        return name;
    }

    /**
     * Retorna un String amb les dades de tots els items de l'inventari de
     * l'aventurer.
     * 
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

    public void move(String exitName) throws LaberintException {
        if (currentLocation.nextRoom(exitName) == null)
            throw new LaberintException("No such exit");
        currentLocation = currentlocation.exits.get(exitName);
    }

    public void pickUp(String itemName) throws LaberintException {
        Item item = currentLocation.retrieveItem(itemName);
        if (encumbrance + currentLocation.retrieveItem(itemName).getEncumbrance() > MAX_ENCUMBRANCE) {
            currentLocation.putItem(item);
            throw new LaberintException("Inventory is full");
        }
        inventory.put(itemName, item);
    }
}