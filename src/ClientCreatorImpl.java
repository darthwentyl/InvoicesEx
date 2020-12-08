
public class ClientCreatorImpl implements ClientCreatorIfc {
    private AddressCreatorIfc _addrCreator;
    private NameCreatorIfc _nameCreator;

    ClientCreatorImpl() {
        _addrCreator = new AddressCreatorImpl();
        _nameCreator = new NameCreatorImpl();
    }

    @Override
    public Client create() {
        Client client = new Client();
        client.setName(_nameCreator.create());
        client.setAddress(_addrCreator.create());
        return client;
    }

}
