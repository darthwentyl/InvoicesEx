
public class Invoice {
    private int _id;
    private Client _client;
    private InvoiceDates _invoiceDates;
    private Payment _payment;
    private ItemCollection _items;

    Invoice() {
        _items = new ItemCollection();
    }

    public void setId(int id) {
        _id = id;
    }

    public void setClient(Client client) {
        _client = client;
    }

    public void setInvoiceDates(InvoiceDates invoiceDates) {
        _invoiceDates = invoiceDates;
    }

    public void setPayment(Payment payment) {
        _payment = payment;
    }

    public void addItem(Item item) {
        _items.addItem(item);
    }

    public int getId() {
        return _id;
    }

    public Client getClient() {
        return _client;
    }

    public InvoiceDates getInvoiceDates() {
        return _invoiceDates;
    }

    public Payment getPayment() {
        return _payment;
    }

    public Item [] getItems() {
        return _items.getItems();
    }
}
