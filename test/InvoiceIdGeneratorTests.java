import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvoiceIdGeneratorTests {

    @Test
    void test() {
        int id1 = InvoiceIdGenerator.generateNewId();
        int id2 = InvoiceIdGenerator.generateNewId();
        assertEquals(1, id1);
        assertEquals(2, id2);
    }

}
