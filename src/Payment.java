
public class Payment {
    private Date _paymentDate;
    private PaymentType _paymentType;

    public void setPaymentDate(Date paymentDate) {
        _paymentDate = paymentDate;
    }

    public void setPaymentType(PaymentType paymentType) {
        _paymentType = paymentType;
    }

    public Date getPaymentDate() {
        return _paymentDate;
    }

    public PaymentType getPaymentType() {
        return _paymentType;
    }

    public String toString() {
        return new String("\tPayment date: " + _paymentDate + "\n\tPayment type: " + _paymentType.name());
    }
}
