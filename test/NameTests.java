import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NameTests {

    Name _name;

    @BeforeEach
    void setUp() {
        _name = new Name();
        _name.setFirstName("firstName");
        _name.setLastName("lastName");
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

    @Test
    void test_isEqual_false() {
        Name name = new Name();
        name.setFirstName("abc");
        name.setLastName("def");
        assertFalse(_name.isEqual(name));
    }

    @Test
    void test_isEqual_true() {
        Name name = new Name();
        name.setFirstName("firstName");
        name.setLastName("lastName");
        assertTrue(_name.isEqual(name));
    }

    @Test
    void test_isEqual_first_true_last_false() {
        Name name = new Name();
        name.setFirstName("firstName");
        name.setLastName("abc");
        assertFalse(_name.isEqual(name));
    }

    @Test
    void test_isEqual_first_false_last_true() {
        Name name = new Name();
        name.setFirstName("abc");
        name.setLastName("lastName");
        assertFalse(_name.isEqual(name));
    }
}
