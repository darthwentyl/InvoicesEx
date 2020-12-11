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

    public int createIntField(String info) {
        System.out.print(info);
        int numberField = -1;
        do {
            try {
                String str = _scanner.next();
                numberField  = Integer.valueOf(str);
                
            } catch (Exception e) {
                System.err.println("Please provide integer number!!! ");
            }
        } while (numberField == -1);
        return numberField;
    }

    public double createDoubleField(String info) {
        System.out.print(info);
        double numberField = -1;
        do {
            try {
                String str = _scanner.next();
                numberField  = Double.valueOf(str);
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
