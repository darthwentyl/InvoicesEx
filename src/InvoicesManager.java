
public class InvoicesManager {
    private InvoiceCollection _invoices;

    public InvoicesManager() {
        _invoices = new InvoiceCollection();
    }

    public void createNewInvoice() {
        InvoiceCreatorIfc creator = new InvoiceCreatorImpl(
                new NameCreatorImpl(),
                new AddressCreatorImpl(),
                new DateCreatorImpl(),
                new PaymentCreatorImpl(),
                new ItemCreatorImpl()
                );
        _invoices.addInvoice(creator.createNew());
    }

    public void addNewPositionToExistInvoice() {
        
    }

    public void printInvoice() {
        
    }

    public void printInvoices() {
        Invoice [] invoices = _invoices.getInvoices();
        for (int i = 0; i < invoices.length; ++i) {
            System.out.println("Client: ");
            System.out.println(invoices[i].getClient());
            System.out.println("Dates:");
            System.out.println(invoices[i].getInvoiceDates());
            System.out.println("Payment detail:");
            System.out.println(invoices[i].getPayment());
            System.out.println("Items:");
            Item [] items = invoices[i].getItems();
            for (int j = 0; j < items.length; j++) {
                System.out.println(items[j]);
                System.out.println("______________________________________________________________");
            }
        }
        
    }

    public void printClientInvoice() {
        
    }
}
