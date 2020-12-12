import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentTests {

    Payment _payment;

    @BeforeEach
    void SetUp() {
        _payment = new Payment();
    }

    @Test
    void test_get_payment_date() {
        Date date = new Date();
        date.setDay(1);
        date.setMonth(2);
        date.setYear(2000);
        _payment.setPaymentDate(date);
        assertEquals(1, _payment.getPaymentDate().getDay());
        assertEquals(2, _payment.getPaymentDate().getMonth());
        assertEquals(2000, _payment.getPaymentDate().getYear());
    }

    @Test
    void test_get_payment_type() {
        _payment.setPaymentType(PaymentType.CARD);
        assertEquals(PaymentType.CARD, _payment.getPaymentType());
    }
}
