import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddressTests {

    Address _address;

    @BeforeEach
    void setUp() {
        _address = new Address();
    }
    
//    @Test
//    void test_illegall_street_null() {
//        assertThrows(NullPointerException.class, 
//                () -> { 
//                    _address.setStreet(null);
//                });
//    }
//
//    @Test
//    void test_illegall_town_null() {
//        assertThrows(NullPointerException.class, 
//                () -> {
//                    _address.setTown(null);
//                });
//    }
//
//    @Test
//    void test_illegall_country_null() {
//        assertThrows(NullPointerException.class, 
//                () -> {
//                    _address.setCountry(null);
//                });
//    }
//
//    @Test
//    void test_illegall_street_empty() {
//        assertThrows(IllegalArgumentException.class, 
//                () -> {
//                    _address.setStreet("");
//                });
//    }
//
//    @Test
//    void test_illegall_town_empty() {
//        assertThrows(IllegalArgumentException.class, 
//                () -> {
//                    _address.setTown("");
//                });
//    }
//
//    @Test
//    void test_illegall_country_empty() {
//        assertThrows(IllegalArgumentException.class, 
//                () -> {
//                    _address.setCountry("");
//                });
//    }

    @Test
    void test_get_street() {
        _address.setStreet("street");
        assertEquals("street", _address.getStreet());
    }

    @Test
    void test_get_town() {
        _address.setTown("town");
        assertEquals("town", _address.getTown());
    }

    @Test
    void test_get_country() {
        _address.setCountry("country");
        assertEquals("country", _address.getCountry());
    }

    @Test
    void test_get_building_number() {
        _address.setBuildingNumber(1);
        assertEquals(1, _address.getBuildingNumber());
    }

    @Test
    void test_get_flat_number() {
        _address.setFlatNumber(2);
        assertEquals(2, _address.getFlatNumber());
    }
}
