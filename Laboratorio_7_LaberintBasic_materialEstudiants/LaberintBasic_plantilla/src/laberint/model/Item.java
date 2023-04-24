package laberint.model;

/** Atributs i mètodes dels items. */
public class Item {
    /** Retorna una String amb el valor dels atributs de l'Item.
     * @return la descripció textual de l'Item
     */
    @Override
    public String toString(){
        return "[" + this.name + ", valor " + this.value + ", car " + this.encumbrance + "] " + this.description;
    }
}
