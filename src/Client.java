
public class Client {
    private Name _name;
    private Address _address;

    Client(Name name, Address address) {
        _name = name;
        _address = address;
    }

    public Name getName() {
        return _name;
    }

    public Address getAddress() {
        return _address;
    }

}
