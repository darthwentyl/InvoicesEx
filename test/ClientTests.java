import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTests {

    @Test
    void test_getters() {
        Client client = new Client();

        Name name = new Name();
        name.setFirstName("firstName");
        name.setLastName("lastName");
        client.setName(name);

        Address address = new Address();
        address.setBuildingNumber(1);
        address.setCountry("country");
        address.setFlatNumber(2);
        address.setStreet("street");
        address.setTown("town");
        client.setAddress(address);

        assertEquals("firstName", client.getName().getFirstName());
        assertEquals("lastName", client.getName().getLastName());
        assertEquals("street", client.getAddress().getStreet());
        assertEquals("town", client.getAddress().getTown());
        assertEquals("country", client.getAddress().getCountry());
        assertEquals(1, client.getAddress().getBuildingNumber());
        assertEquals(2, client.getAddress().getFlatNumber());
    }

}
