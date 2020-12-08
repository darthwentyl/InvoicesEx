
public class Address {
    private String _street;
    private String _town;
    private String _country;
    private int _buldingNumber;
    private int _flatNumber;

    public void setStreet(String street) {
        _street = street;
    }

    public void setTown(String town) {
        _town = town;
    }

    public void setCountry(String country) {
        _country = country;
    }

    public void setBuildingNumber(int buildingNumber) {
        _buldingNumber = buildingNumber;
    }

    public void setFlatNumber(int flatNumber) {
        _flatNumber = flatNumber;
    }

    public String getStreet() {
        return _street;
    }

    public String getTown() {
        return _town;
    }

    public String getCountry() {
        return _country;
    }

    public int getBuildingNumber() {
        return _buldingNumber;
    }

    public int getFlatNumber() {
        return _flatNumber;
    }
    
}
