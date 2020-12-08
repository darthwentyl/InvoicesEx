import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTests {

    @Test
    void test_getters() {
        Client client = new Client(
                new Name(),
                new Address());
        assertEquals(null, client.getName().getFirstName());
        assertEquals(null, client.getName().getLastName());
        assertEquals(null, client.getAddress().getStreet());
        assertEquals(null, client.getAddress().getTown());
        assertEquals(null, client.getAddress().getCountry());
        assertEquals(0, client.getAddress().getBuildingNumber());
        assertEquals(0, client.getAddress().getFlatNumber());
    }

}
