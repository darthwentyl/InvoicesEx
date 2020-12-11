
public class InvoiceIdGenerator {
    static int id = 0;

    static int generateNewId() {
        return ++id;
    }
}
