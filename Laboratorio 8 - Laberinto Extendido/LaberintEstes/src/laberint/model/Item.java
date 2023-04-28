package laberint.model;

/** Atributs i mètodes dels items. */
public class Item {

    private final String name;
    private final String description;
    private int value;
    private int encumbrance;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
        value = 0;
        encumbrance = 0;
    }

    public int getEncumbrance() {
        return encumbrance;
    }

    public String getName() {
        return name;
    }

    public void setEncumbrance(int enc) {
        encumbrance = enc;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Retorna una String amb el valor dels atributs de l'Item.
     * 
     * @return la descripció textual de l'Item
     */
    @Override
    public String toString() {
        return "[" + this.name + ", valor " + this.value + ", car " + this.encumbrance + "] " + this.description;
    }

    @Override
    public boolean equals(Object object) {
        Item item = (Item) object;
        if (item == this)
            return true;
        else
            return false;
    }
}
