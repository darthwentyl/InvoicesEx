
public class InvoicesManager {
    private InvoiceCollection _invoices;

    public InvoicesManager() {
        _invoices = new InvoiceCollection();
    }

    public void createNewInvoice() {
        InvoiceCreatorIfc creator = new InvoiceCreatorImpl(
                new NameCreatorImpl(),
                new AddressCreatorImpl());
        _invoices.addInvoice(creator.createNew());
    }

    public void addNewPositionToExistInvoice() {
        
    }

    public void printInvoice() {
        
    }

    public void printInvoices() {
        
    }

    public void printClientInvoice() {
        
    }
}
