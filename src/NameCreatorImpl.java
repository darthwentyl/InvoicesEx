import java.util.Scanner;

public class NameCreatorImpl implements NameCreatorIfc {
    FieldCreator _fieldCreator;

    NameCreatorImpl() {
        _fieldCreator = new FieldCreator();
    }

    @Override
    public Name create() {
        Name name = new Name();
        name.setFirstName(_fieldCreator.createStringField("Type first name: "));
        name.setLastName(_fieldCreator.createStringField("Type last name: "));
        return name;
    }
}
