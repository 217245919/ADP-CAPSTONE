package za.ac.cput.Group19CarWash.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    @Test
    void createPayment() {

        Payment payment = PaymentFactory.createPayment(Integer.parseInt("100"), "23 March 2022");
        assertNotNull(payment);
        System.out.println(payment);
    }

}