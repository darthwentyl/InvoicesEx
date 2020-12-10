import java.util.Scanner;

public class AddressCreatorImpl implements AddressCreatorIfc {
    private Scanner _scanner;

    AddressCreatorImpl() {
        _scanner = new Scanner(System.in);
    }

    @Override
    protected void finalize() throws Throwable {
        _scanner.close();
    }

    @Override
    public Address create() {
        Address address = new Address();
        address.setCountry(createCountry());
        address.setTown(createTown());
        address.setStreet(createStreet());
        address.setBuildingNumber(createBuildNumber());
        address.setFlatNumber(createFlatNumber());
        return address;
    }

    private int createFlatNumber() {
        System.out.print("Type flast number: ");
        return _scanner.nextInt();
    }

    private int createBuildNumber() {
        System.out.print("Type build number: ");
        return _scanner.nextInt();
    }

    private boolean validate(String str, String errMsg) {
        if (str.isEmpty()) {
            System.err.println(errMsg);
            return false;
        }
        return true;
    }
    
    private String createStreet() {
        System.out.print("Type street: ");
        String street = new String();
        String errMsg = new String("Street cannot be empty. Please type once again.");
        while (true) {
            street = _scanner.next();
            if (validate(street, errMsg)) {
                break;
            }
        }
        return street;
    }

    private String createTown() {
        System.out.print("Type town: ");
        String town = new String();
        String errMsg = new String("Town cannot be empty. Please type once again.");
        while (true) {
            town = _scanner.next();
            if (validate(town, errMsg)) {
                break;
            }
        }
        return town;
    }

    private String createCountry() {
        System.out.print("Type country: ");
        String country = new String();
        String errMsg = new String("Country cannot be empty. Please type once again.");
        while (true) {
            country = _scanner.next();
            if (validate(country, errMsg)) {
                break;
            }
        }
        return country;
    }

}
