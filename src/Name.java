
public class Name {
    private String _firstName;
    private String _lastName;

    public void setFirstName(String firstName) {
//        if (firstName == null) {
//            throw new NullPointerException("First name is null pointer!");
//        }
//        if (firstName == "") {
//            throw new IllegalArgumentException("First or last name is empty!");
//        }
        _firstName = firstName;
    }

    public void setLastName(String lastName) {
//        if (lastName == null) {
//            throw new NullPointerException("Last name is null pointer!");
//        }
//        if (lastName == "") {
//            throw new IllegalArgumentException("Last name is empty!");
//        }
        _lastName = lastName;
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }
}
