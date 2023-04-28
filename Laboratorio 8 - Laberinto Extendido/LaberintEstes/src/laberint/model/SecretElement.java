package laberint.model;

public class SecretElement {

    public static final int OK_ACTION = 0;
    public static int ELEMENT_USED = 1;
    public static final int WRONG_KEY = 2;
    
    protected String name;
    protected boolean used;
    protected Item keyModel;
    protected Room where;

    public SecretElement(String name, Item model, Room here) {
        this.name = name;
        this.keyModel = model;
        this.where = here;
    }

    public String getName() {
        return name;
    }

    public int use(Item key) {
        if (!used) {
            if (key == keyModel) {
                return OK_ACTION;
            }
            return WRONG_KEY;
        }
        return ELEMENT_USED;
    }
}