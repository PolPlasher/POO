package laberint.model;

import java.util.TreeMap;
import java.util.Iterator;

/** Atributs i mètodes de l'Aventurer. */
public class Adventurer {

    /** Càrrega màxima que pot suportar l'aventurer. */
    private static final int MAX_ENCUMBRANCE = 15;
    private final String name;
    private Room currentLocation;
    private final TreeMap<String, Item> inventory;
    private int encumbrance;

    // Estès
    public static final int OK_ACTION = 0;
    public static final int NO_SUCH_EXIT = 1;
    public static final int INVENTORY_IS_FULL = 2;
    public static final int NO_SUCH_ITEM_IN_INVENTORY = 3;
    public static final int NO_SUCH_ITEM_IN_ROOM = 4;
    public static final int NO_SUCH_ELEMENT_IN_ROOM = 5;

    public Adventurer(String name, Room startLocation) {
        this.name = name;
        this.currentLocation = startLocation;
        inventory = new TreeMap<>();
        encumbrance = 0;
    }

    public String getName() {
        return name;
    }

    public Room getCurrentLocation() {
        return currentLocation;
    }

    public int move(String exitName) {
        if (currentLocation.nextRoom(exitName) == null)
            return NO_SUCH_EXIT;
        currentLocation = currentLocation.nextRoom(exitName);
        return OK_ACTION;
    }

    public int pickUp(String itemName) {
        Item item = currentLocation.retrieveItem(itemName);
        if (item == null)
            return NO_SUCH_ITEM_IN_ROOM;
        if (encumbrance + item.getEncumbrance() > MAX_ENCUMBRANCE) {
            currentLocation.putItem(item);
            return INVENTORY_IS_FULL;
        }
        inventory.put(itemName, item);
        return OK_ACTION;
    }

    public int drop(String itemName) {
        if (!inventory.containsKey(itemName))
            return NO_SUCH_ITEM_IN_INVENTORY;
        encumbrance -= inventory.get(itemName).getEncumbrance();
        currentLocation.putItem(inventory.get(itemName));
        inventory.remove(itemName);
        return OK_ACTION;
    }

    public int useItemOnElement(String itemName, String elementName) {
        if (inventory.get(elementName) == null)
            return NO_SUCH_ITEM_IN_INVENTORY;
        if (currentLocation.getElement(elementName) == null)
            return NO_SUCH_ELEMENT_IN_ROOM;
        return currentLocation.getElement(elementName).use(inventory.get(elementName));
    }

    public int getTotalValueInventory() {
        Iterator<Item> iterator = inventory.values().iterator();
        int totalValue = 0;
        while (iterator.hasNext()) {
            totalValue += iterator.next().getValue();
        }
        return totalValue;
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
}