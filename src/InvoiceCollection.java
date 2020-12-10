
public class InvoiceCollection {
    private Invoice [] _invoices;

    public void addInvoice(Invoice invoice) {
        Invoice [] newInvoices = new Invoice [_invoices == null ? 1 : _invoices.length + 1];
        for (int i = 0; i < newInvoices.length - 1; i++) {
            newInvoices[i] = _invoices[i];
        }
        newInvoices[newInvoices.length - 1] = invoice;
        _invoices = newInvoices;
    }

    public Invoice [] getInvoices() {
        return _invoices;
    }
}
