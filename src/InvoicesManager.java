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
        if (isEmpty()) {
            return;
        }

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

    public void printInvoiceId() {
        if (isEmpty()) {
            return;
        }

        System.out.print("Type invoice id: ");
        Invoice invoice = getInvoice();
        invoice.print();
    }

    public void printInvoices() {
        if (isEmpty()) {
            return;
        }
        
        Invoice [] invoices = _invoices.getInvoices();
        for (int i = 0; i < invoices.length; ++i) {
            invoices[i].print();
        }
    }

    public void printClientInvoice() {
        if (isEmpty()) {
            return;
        }

        NameCreatorIfc nameCreator = new NameCreatorImpl();
        Name name = nameCreator.create();
        Invoice [] clientInvoices = _invoices.getClientInvoices(name);
        if (clientInvoices == null) {
            System.err.println("Client " + name.getFirstName() + " " + name.getLastName() + " doesn't exist!!!");
            System.err.println("Please create client invoice using \"n\" option!!!");
            return;
        }
        for (int i = 0; i < clientInvoices.length; ++i) {
            clientInvoices[i].print();
        }
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

    private boolean isEmpty() {
        if (_invoices.getInvoices() == null) {
            System.err.println("Invoices is empty!!! Please create invoice using \"n\" option");
            return true;
        }
        return false;
    }

}
