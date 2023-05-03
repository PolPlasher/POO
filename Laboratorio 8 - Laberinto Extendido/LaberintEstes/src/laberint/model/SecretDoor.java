package laberint.model;

public class SecretDoor extends SecretElement {

    Room hiddenRoom;

    public SecretDoor(String name, Item keyModel, Room here, Room hiddenR) {
        super(name, keyModel, here);
        this.hiddenRoom = hiddenR;
    }

    @Override
    public int use(Item key) {
        if (!used) {
            if (key == keyModel) {
                where.connect(hiddenRoom, name);
                return OK_ACTION;
            }
            return WRONG_KEY;
        }
        return ELEMENT_USED;
    }
}