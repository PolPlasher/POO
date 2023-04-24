package laberint.model;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

/** Atributs i mètodes d'una sala del laberint. */
public class Room {

    private final String description;
    private Map<String, Room> exits;
    private Map<String, Item> items;
    private final String name;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Connecta unidireccionalment aquesta sala amb una altra.
    public void connect(Room destination, String exitName) {

    }

    public String getName() {
        return this.name;
    }

    // Retorna la sala a la qual s'accedeix per una sortida donada.
    public Room nextRoom(String exitName) {
        return 0;
    }

    public void putItem(Item item) {

    }

    public Item retrieveItem(String itemName) {

    }

    /**
     * Retorna una String amb el valor actual dels atributs de la Room.
     * 
     * @return la String.
     */
    @Override
    public String toString() {
        String text = "[" + this.getName() + "]\n";
        text += this.description + "\n";
        Iterator<String> itemNames = this.items.keySet().iterator();
        if (itemNames.hasNext() == false) {
            text += "No hi ha cap item en aquesta sala.\n";
        } else {
            while (itemNames.hasNext()) {
                String itName = itemNames.next();
                text += "Pots veure que hi ha un item [" + itName + "].\n";
            }
        }
        text += "Accessos:";
        Iterator<String> itExitNames = this.exits.keySet().iterator();
        while (itExitNames.hasNext()) {
            String exit = itExitNames.next();
            text += " " + exit;
        }
        text += "\n";
        return text;
    }
}
