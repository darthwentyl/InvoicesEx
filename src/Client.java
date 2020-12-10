
public class Client {
    private Name _name;
    private Address _address;

    public void setName(Name name) {
        _name = name;
    }

    public void setAddress(Address address) {
        _address = address;
    }

    public Name getName() {
        return _name;
    }

    public Address getAddress() {
        return _address;
    }

    public String toString() {
        return new String("Name: " + _name + "\n"
                        + "Address:\n" + _address);
    }
}
