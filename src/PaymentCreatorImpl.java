import java.util.Scanner;

public class PaymentCreatorImpl implements PaymentCreatorIfc {
    private Scanner _scanner;

    @Override
    protected void finalize() throws Throwable {
        _scanner.close();
    }

    public PaymentCreatorImpl() {
        _scanner = new Scanner(System.in);
    }

    @Override
    public Payment create() {
        Payment payment = new Payment();
        payment.setPaymentDate(createPaymentDate());
        payment.setPaymentType(createPaymentType());
        return payment;
    }

    private PaymentType createPaymentType() {
        printPaymentType();
        int paymentType = 0;
        PaymentType ret;
        while (true) {
            System.out.println("Type payment type:");
            paymentType = _scanner.nextInt();
            if (paymentType < 0 || paymentType >= PaymentType.NOT_ACK.ordinal()) {
                System.err.println("Wrong payment type: " + paymentType);
                printPaymentType();
            } else {
                ret = convertPaymentType(paymentType);
                break;
            }
        }
        return ret;
    }

    private PaymentType convertPaymentType(int paymentType) {
        switch (paymentType) {
        case 0:
            return PaymentType.CASH;
        case 1:
            return PaymentType.CARD;
        case 2:
            return PaymentType.TRANSFER;
        default:
            break;
        }
        return null;
    }

    private void printPaymentType() {
        System.out.println("\n0 - cash");
        System.out.println("1 - card");
        System.out.println("2 - transfer");
    }

    private Date createPaymentDate() {
        DateCreatorIfc dateCreator = new DateCreatorImpl();
        System.out.println("Type payment date: ");
        return dateCreator.create();
    }
}
