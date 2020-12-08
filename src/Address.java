
public class Address {
    private String _street;
    private String _town;
    private String _country;
    private int _buldingNumber;
    private int _flatNumber;

    public void setStreet(String street) {
//        if (street == null) {
//            throw new NullPointerException("Street cannot be null pointer!");
//        }
//        if (street == "") {
//            throw new IllegalArgumentException("Street cannot be empty!");
//        }
        _street = street;
    }

    public void setTown(String town) {
//        if (town == null) {
//            throw new NullPointerException("Town cannot be null pointer!");
//        }
//        if (town == "") {
//            throw new IllegalArgumentException("Town cannot be empty!");
//        }
        _town = town;
    }

    public void setCountry(String country) {
//        if (country == null) {
//            throw new NullPointerException("Country cannot be null pointer!");
//        }
//        if (country == "") {
//            throw new IllegalArgumentException("Country cannot be empty!");
//        }
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
