import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemImplTests {
    @Test
    void test_getters() {
        Item item = new ItemImpl(12, "name", 34.9);
        assertEquals(12, item.getCount());
        assertEquals("name", item.getName());
        assertEquals(34.9, item.getCost());
    }
}
