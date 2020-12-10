import java.util.Scanner;

public class NameCreatorImpl implements NameCreatorIfc {
    Scanner _scanner;

    NameCreatorImpl() {
        _scanner = new Scanner(System.in);
    }

    @Override
    protected void finalize() throws Throwable {
        _scanner.close();
    }

    @Override
    public Name create() {
        Name name = new Name();
        name.setFirstName(createName("First"));
        name.setLastName(createName("Last"));
        return name;
    }

    private String createName(String id) {
        String name = new String();
        while (true) {
            System.out.print("Type " + id + " name: ");
            name = _scanner.next();
            if (name.isEmpty()) {
                System.err.println(id + " name cannot be empty. Please type once againg.");
            } else {
                break;
            }
        }
        return name;
    }

}
