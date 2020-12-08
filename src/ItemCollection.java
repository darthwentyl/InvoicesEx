
public class ItemCollection {
    private Item [] _items;

    public void addItem(Item item) {
        Item [] newItems = new Item [_items == null ? 1 : _items.length + 1];
        for (int i = 0; i < newItems.length - 1; i++) {
            newItems[i] = _items[i];
        }
        newItems[newItems.length - 1] = item;
        _items = newItems;
    }

    public Item [] getItems() {
        return _items;
    }
}
