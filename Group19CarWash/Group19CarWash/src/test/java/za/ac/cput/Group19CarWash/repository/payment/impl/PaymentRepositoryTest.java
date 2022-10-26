package za.ac.cput.Group19CarWash.repository.payment.impl;

/*
  PaymentRepositoryTest.java
  Repository Test for the Payment
  Lyle Haines (217245919)
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Payment;
import za.ac.cput.Group19CarWash.factory.PaymentFactory;

import static org.junit.jupiter.api.Assertions.*;

class PaymentRepositoryTest {

    private static PaymentRepository repository = PaymentRepository.getPaymentList();
    private static Payment payment = PaymentFactory.createPayment(Integer.parseInt("200"), "16 June 2022");

    @Test
    void create() {
        Payment created = repository.create(payment);
        assertEquals(payment.getPaymentId(), created.getPaymentId());
        System.out.println("Create: " + created);
    }

    @Test
    void read() {
        Payment read = repository.read(payment.getPaymentId());
        System.out.println(read);
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        Payment updated = new Payment.Builder().copy(payment).setTotalAmount(Integer.parseInt("170")).setDate("10 July 2022")
                .build();
        System.out.println(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(payment.getPaymentId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void getALL() {
        System.out.println("Show all: ");
        System.out.println(repository.findAll());
    }

}