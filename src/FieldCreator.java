import java.util.Scanner;

public class FieldCreator {
    private Scanner _scanner;

    FieldCreator() {
        _scanner = new Scanner(System.in);
    }

    @Override
    protected void finalize() throws Throwable {
        _scanner.close();
    }

    public int createNumberField(String info) {
        System.out.print(info);
        int numberField = -1;
        do {
            try {
                String str = _scanner.next();
                numberField  = Integer.valueOf(str);
                
            } catch (Exception e) {
                System.err.println("Please provide number!!! ");
            }
        } while (numberField == -1);
        return numberField;
    }

    public String createStringField(String info) {
        System.out.print(info);
        return _scanner.next();
    }
}
