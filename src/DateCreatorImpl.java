import java.util.Scanner;

public class DateCreatorImpl implements DateCreatorIfc {
    private Scanner _scanner;

    final static int [] DAYS_MONTH = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    DateCreatorImpl() {
        _scanner = new Scanner(System.in);
    }

    @Override
    protected void finalize() throws Throwable {
        _scanner.close();
    }

    @Override
    public Date create() {
        Date date = new Date();
        date.setYear(cretaeYear());
        date.setMonth(createMonth());
        date.setDay(createDay(DAYS_MONTH[date.getMonth() - 1]));
        return date;
    }

    private int cretaeYear() {
        int year = 0;
        System.out.print("Type year: ");
        while (true) {
            year = _scanner.nextInt();
            if (year < 1970) {
                System.err.println("Year cannot be less than 1970. Please type once again.");
            } else if (year > 2100) {
                System.err.println("Year cannot be greatest than 2100. Please type once again.");
            } else {
                break;
            }
        }
        return year;
    }

    private int createMonth() {
        int month = 0;
        System.out.print("Type month: ");
        while (true) {
            month = _scanner.nextInt();
            if (month < 1) {
                System.err.println("Month cannot be less than 1. Please type once again.");
            } else if (month > 12) {
                System.err.println("Month cannot be greatest than 12. Please type once again.");
            } else {
                break;
            }
        }
        return month;
    }

    private int createDay(int daysMonth) {
        int day = 0;
        System.out.print("Type day: ");
        while (true) {
            day = _scanner.nextInt();
            if (day < 1) {
                System.err.println("Day cannot be less than 1. Please type once again.");
            } else if (day > daysMonth) {
                System.err.println("Day cannot be greatest than" + daysMonth + ". Please type once again.");
            } else {
                break;
            }
        }
        return day;
    }

}
