import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemCollectionTests {
    private ItemCollection _collection;

    @BeforeEach
    void setUp() throws Exception {
        _collection = new ItemCollection();
        _collection.addItem(new ItemImpl(1, "name1", 1.0));
        _collection.addItem(new ItemImpl(2, "name2", 2.0));
    }

    @Test
    void test() {
        assertEquals(2, _collection.getItems().length);
    }

}
