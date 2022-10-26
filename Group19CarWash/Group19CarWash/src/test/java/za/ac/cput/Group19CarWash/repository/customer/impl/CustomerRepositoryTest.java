package za.ac.cput.Group19CarWash.repository.customer.impl;

/*
  CustomerRepositoryTest.java
  Repository Test for the Customer
  Lyle Haines (217245919)
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Customer;
import za.ac.cput.Group19CarWash.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryTest {

    private static CustomerRepository repository = CustomerRepository.getCustomerList();

    private static Customer customer = CustomerFactory.createCustomer("Theodore", "Walter", "21 York street, Milnerton", "0865341323", "CA-2224");

    @Test
    void create() {
        Customer created = repository.create(customer);
        assertEquals(customer.getCusId(), created.getCusId());
        System.out.println("Create: " + created);
    }

    @Test
    void read() {
        Customer read = repository.read(customer.getCusId());
        System.out.println(read);
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        Customer updated = new Customer.Builder().copy(customer).setId(Long.valueOf(1)).setCusId("1").setFirstname("Theodore").setLastname("Walter")
                .setAddress("21 York street, Milnerton")
                .setCellnr("0865341323")
                .setCarplate("CA 2224")
                .build();
        System.out.println(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(customer.getCusId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void getALL() {
        System.out.println("Show all: ");
        System.out.println(repository.findAll());
    }

}