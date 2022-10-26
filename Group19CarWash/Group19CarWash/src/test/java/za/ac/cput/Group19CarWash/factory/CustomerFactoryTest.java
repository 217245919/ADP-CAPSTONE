package za.ac.cput.Group19CarWash.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    void createCustomer() {

        Customer customer = CustomerFactory.createCustomer("Gareth", "Southgate", "50 Isaacs Way, Ottery", "0764333459", "CAA-8764");
        assertNotNull(customer);
        System.out.println(customer);
    }

}