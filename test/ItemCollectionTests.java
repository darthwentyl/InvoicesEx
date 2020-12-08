import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemCollectionTests {
    private ItemCollection _collection;

    @BeforeEach
    void setUp() throws Exception {
        _collection = new ItemCollection();
        Item item = new Item();
        item.setCount(1);
        item.setName("name1");
        item.setCost(1.0);
        _collection.addItem(item);

        item = new Item();
        item.setCount(2);
        item.setName("name2");
        item.setCost(2.0);
        _collection.addItem(item);
    }

    @Test
    void test() {
        Item [] items = _collection.getItems();
        assertEquals(2, items.length);
        assertEquals(1, items[0].getCount());
        assertEquals("name1", items[0].getName());
        assertEquals(1.0, items[0].getCost());
        assertEquals(2, items[1].getCount());
        assertEquals("name2", items[1].getName());
        assertEquals(2.0, items[1].getCost());
    }

}
