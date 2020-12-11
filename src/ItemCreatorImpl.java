
public class ItemCreatorImpl implements ItemCreatorIfc {
    private FieldCreator _fieldCreator;

    ItemCreatorImpl() {
        _fieldCreator = new FieldCreator();
    }

    @Override
     public Item create() {
        Item item = new Item();
        item.setName(_fieldCreator.createStringField("Type product name: "));
        item.setCount(_fieldCreator.createIntField("Type count: "));
        item.setCost(_fieldCreator.createDoubleField("Type cost: "));
        return item;
    }
}
