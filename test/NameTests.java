import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NameTests {

    Name _name;

    @BeforeEach
    void setUp() {
        _name = new Name();
    }

    @Test
    void test_illegal_first_name_null() {
        assertThrows(NullPointerException.class, 
                () -> {
                    _name.setFirstName(null);
                });
    }

    @Test
    void test_illegal_first_name_empty() {
        assertThrows(IllegalArgumentException.class, 
                () -> {
                    _name.setFirstName("");
                });
    }

    @Test
    void test_illegal_last_name_null() {
        assertThrows(NullPointerException.class, 
                () -> {
                    _name.setLastName(null);
                });
    }

    @Test
    void test_illegal_last_name_empty() {
        assertThrows(IllegalArgumentException.class, 
                () -> {
                    _name.setLastName("");
                });
    }

    @Test
    void test_get_first_name() {
        _name.setFirstName("first");
        assertEquals("first", _name.getFirstName());
    }

    @Test
    void test_get_last_name() {
        _name.setLastName("last");
        assertEquals("last", _name.getLastName());
    }
}
