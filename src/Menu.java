import java.util.Scanner;

public class Menu {
    private InvoicesManager _manager;
    private Scanner _scanner;

    Menu() {
        _scanner = new Scanner(System.in);
        _manager = new InvoicesManager(_scanner);
    }

    @Override
    protected void finalize() throws Throwable {
        _scanner.close();
    }

    private void printOptions() {
        System.out.println();
        System.out.println("Options:");
        System.out.println("\tk - finish");
        System.out.println("\tn - new invoice");
        System.out.println("\tu - update exist invoice");
        System.out.println("\ts - show invoice id");
        System.out.println("\tl - show list invoices");
        System.out.println("\tc - show client invoince");
        System.out.println("\th - show this help");
    }

    public void run() {
        String option = new String();
        printOptions();
        while (true) {
            System.out.println();
            System.out.println("Please type option:");
            option = _scanner.next();
            if (option.equals("n")) {
                _manager.createNewInvoice();
            } else if (option.equals("u")) {
                _manager.addNewPositionToExistInvoice();
            } else if (option.equals("s")) {
                _manager.printInvoiceId();
            } else if (option.equals("l")) {
                _manager.printInvoices();
            } else if (option.equals("c")) {
                _manager.printClientInvoice();
            } else if (option.equals("h")){
                printOptions();
            } else if (option.equals("k")) {
                break;
            } else {
                System.err.println("Unknow option: " + option);
                printOptions();
            }
        }
        System.out.println("EXIT");
    }
}
