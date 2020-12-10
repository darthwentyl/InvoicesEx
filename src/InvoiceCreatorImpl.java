
public class InvoiceCreatorImpl implements InvoiceCreatorIfc {
    private NameCreatorIfc _nameCreator;
    private AddressCreatorIfc _addressCreator;

    InvoiceCreatorImpl(
            NameCreatorIfc nameCreator,
            AddressCreatorIfc addressCreator) 
    {
        _nameCreator = nameCreator;
        _addressCreator = addressCreator;
    }

    @Override
    public Invoice createNew() {
        Invoice invoice = new Invoice();
        Client client = new Client();
        client.setName(_nameCreator.create());
        client.setAddress(_addressCreator.create());
        return invoice;
    }
}
