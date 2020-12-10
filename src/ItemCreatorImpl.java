import java.util.Scanner;

public class ItemCreatorImpl implements ItemCreatorIfc {
    private Scanner _scanner;
    
    ItemCreatorImpl() {
        _scanner = new Scanner(System.in);
    }

    @Override
    protected void finalize() throws Throwable {
        _scanner.close();
    }

    @Override
     public Item create() {
        Item item = new Item();
        item.setCount(createCount());
        item.setName(createName());
        item.setCost(createCost());
        return item;
    }

    private double createCost() {
        System.out.print("Type cost: ");
        return _scanner.nextDouble();
    }

    private int createCount() {
        System.out.print("Type count: ");
        return _scanner.nextInt();
    }

    private String createName() {
        String name = new String();
        System.out.print("Type product name: ");
        while (true) {
            name = _scanner.next();
            if (name.isEmpty()) {
                System.out.println("Product name cannot be empty. Please type once againg.");
            } else {
                break;
            }
        }
        return name;
    }

}
