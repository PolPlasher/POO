package laberint.model;

public class SecretContainer extends SecretElement {

    public SecretContainer(String name, Item keyModel, Room here, Item hidden) {
        super(name, keyModel, here);
        here.putItem(hidden);
    }

    @Override
    public int use(Item key) {
        if (!used) {
            if (key == keyModel) {
                where.putItem(key);
                return OK_ACTION;
            }
            return WRONG_KEY;
        }
        return ELEMENT_USED;
    }
}