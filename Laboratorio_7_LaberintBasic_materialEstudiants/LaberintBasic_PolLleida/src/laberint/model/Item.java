package laberint.model;

/** Atributs i mètodes dels items. */
public class Item {

    private final String description;
    private int encumbrance;
    private final String name;
    private int value;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getEncumbrance() {
        return this.encumbrance;
    }

    public String getName() {
        return this.name;
    }

    public void setEncumbrance(int enc) {
        this.encumbrance = enc;
    }

    public setValue(int value) {
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
}
