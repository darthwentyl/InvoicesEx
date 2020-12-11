
public class AddressCreatorImpl implements AddressCreatorIfc {
    private FieldCreator _fieldCreator;

    AddressCreatorImpl() {
        _fieldCreator = new FieldCreator();
    }

    @Override
    public Address create() {
        Address address = new Address();
        address.setCountry(_fieldCreator.createStringField("Type country: "));
        address.setTown(_fieldCreator.createStringField("Type town: "));
        address.setStreet(_fieldCreator.createStringField("Type street: "));
        address.setBuildingNumber(_fieldCreator.createIntField("Type build number: "));
        address.setFlatNumber(_fieldCreator.createIntField("Type flat number: "));
        return address;
    }
}
