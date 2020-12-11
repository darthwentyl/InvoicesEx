
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

    public void print() {
        System.out.println("Id: " + _id);
        System.out.println("Client: ");
        System.out.println(_client);
        System.out.println("Dates:");
        System.out.println(_invoiceDates);
        System.out.println("Payment detail:");
        System.out.println(_payment);
        System.out.println("Items:");
        System.out.println("______________________________________________________________");
        Item [] items = _items.getItems();
        for (int j = 0; j < items.length; j++) {
            System.out.println(items[j]);
            System.out.println("______________________________________________________________");
        }
        System.out.println();
    }
}
