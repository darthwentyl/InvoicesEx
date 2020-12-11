
public class Name {
    private String _firstName;
    private String _lastName;

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public String toString() {
        return new String(_firstName + " " + _lastName);
    }

    public boolean isEqual(Name name) {
        if (name.getFirstName() == _firstName && name.getLastName() == _lastName) {
            return true;
        }
        return false;
    }
}
