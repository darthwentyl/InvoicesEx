import java.util.Scanner;

public class InvoiceCreatorImpl implements InvoiceCreatorIfc {
    private NameCreatorIfc _nameCreator;
    private AddressCreatorIfc _addressCreator;
    private DateCreatorIfc _dateCreator;
    private PaymentCreatorIfc _paymentCreator;
    private ItemCreatorIfc _itemCreator;
    Scanner _scanner;

    InvoiceCreatorImpl(
            NameCreatorIfc nameCreator,
            AddressCreatorIfc addressCreator,
            DateCreatorIfc dateCreator,
            PaymentCreatorIfc paymentCreator,
            ItemCreatorIfc itemCreator)
    {
        _nameCreator = nameCreator;
        _addressCreator = addressCreator;
        _dateCreator = dateCreator;
        _paymentCreator = paymentCreator;
        _itemCreator = itemCreator;
        _scanner = new Scanner(System.in);
    }

    @Override
    protected void finalize() throws Throwable {
        _scanner.close();
    }

    @Override
    public Invoice createNew() {
        Invoice invoice = new Invoice();

        Client client = new Client();
        client.setName(_nameCreator.create());
        client.setAddress(_addressCreator.create());

        InvoiceDates invoiceDates = new InvoiceDates();
        System.out.println("Type invoice date: ");
        invoiceDates.setDateInvoice(_dateCreator.create());
        System.out.println("Type sale date: ");
        invoiceDates.setDateSale(_dateCreator.create());

        invoice.setClient(client);
        invoice.setInvoiceDates(invoiceDates);
        invoice.setPayment(_paymentCreator.create());

        String yesNo = new String();

        do {
            invoice.addItem(_itemCreator.create());
            System.out.print("Do you want to add new item [y/n]: ");
            yesNo = _scanner.next();
        } while(yesNo.equals("y"));
        return invoice;
    }
}
