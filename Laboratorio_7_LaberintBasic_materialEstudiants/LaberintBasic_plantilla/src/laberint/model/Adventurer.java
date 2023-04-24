package laberint.model;

import java.util.TreeMap;
import java.util.Iterator;
import laberint.excepcions.LaberintException;

/** Atributs i mètodes de l'Aventurer. */
public class Adventurer {

    /** Càrrega màxima que pot suportar l'aventurer. */
    private static final int MAX_ENCUMBRANCE = 15;
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
}
