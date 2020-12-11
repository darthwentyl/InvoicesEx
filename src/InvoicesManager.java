import java.util.Scanner;

public class InvoicesManager {
    private InvoiceCollection _invoices;
    private Scanner _scanner;

    public InvoicesManager(Scanner scanner) {
        _invoices = new InvoiceCollection();
        _scanner = scanner;
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
        System.out.print("Type invoice id: ");
        Invoice invoice = getInvoice();

        ItemCreatorIfc itemCreator = new ItemCreatorImpl();
        String yesNo = new String();
        System.out.println("Please add new position to exist invoice:");
        do {
            invoice.addItem(itemCreator.create());
            System.out.print("Do you want to add new item [y/n]: ");
            yesNo = _scanner.next();
        } while (yesNo.equals("y"));
    }

    private Invoice getInvoice() {
        int id = -1;
        Invoice invoice;
        while (true) {
            try {
                String str = _scanner.next();
                id = Integer.valueOf(str);
                invoice = _invoices.getInvoice(id);
                if (invoice == null) {
                    System.err.println("Cannot find invoice with id = " + id);
                    System.err.println("Exist:");
                    printIdAndName();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Please provide number!!! ");
            }
        }
        return invoice;
    }

    private void printIdAndName() {
        Invoice [] invoices = _invoices.getInvoices();
        for (int i = 0; i < invoices.length; ++i) {
            System.out.println("Id: " + invoices[i].getId());
            System.out.println("Name: " + invoices[i].getClient().getName());
        }
    }

    public void printInvoice() {
        System.out.print("Type invoice id: ");
        Invoice invoice = getInvoice();
        System.out.println("Id: " + invoice.getId());
        System.out.println("Client: ");
        System.out.println(invoice.getClient());
        System.out.println("Dates:");
        System.out.println(invoice.getInvoiceDates());
        System.out.println("Payment detail:");
        System.out.println(invoice.getPayment());
        System.out.println("Items:");
        Item [] items = invoice.getItems();
        for (int j = 0; j < items.length; j++) {
            System.out.println(items[j]);
            System.out.println("______________________________________________________________");
        }
    }

    public void printInvoices() {
        Invoice [] invoices = _invoices.getInvoices();
        for (int i = 0; i < invoices.length; ++i) {
            System.out.println("Id: " + invoices[i].getId());
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
