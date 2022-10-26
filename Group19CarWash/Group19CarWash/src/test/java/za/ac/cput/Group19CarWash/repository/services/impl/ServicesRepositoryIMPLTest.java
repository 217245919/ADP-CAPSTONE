package za.ac.cput.Group19CarWash.repository.services.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Services;
import za.ac.cput.Group19CarWash.factory.ServicesFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicesRepositoryIMPLTest {
    private static ServicesRepositoryIMPL repository = ServicesRepositoryIMPL.getServicesList();
    private static Services services = ServicesFactory.createServices("1", "Full Service", "1", "1", "1", "1", "R400");

    @Test
    void a_create() {
        Services created = repository.create(services);
        assertEquals(services.getServicesId(), created.getServicesId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Services read = repository.read(services.getServicesId());
        Assertions.assertEquals(services.getServicesId(), read.getServicesId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Services updated = new Services.Builder().copy(services)
                .setServicesId("1")
                .setServicesPkg("Wash Package")
                .setWashTypeId("1")
                .setUpholsteryId("0")
                .setCustomerId("1")
                .setCleanerId("1")
                .setTotalAmount("150")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Update: " + updated);

    }

    @Test
    void e_delete() {
        boolean working = repository.delete(services.getServicesId());
        assertFalse(working);
        System.out.println("Deleting the Booking Below:");
        System.out.println("Deleted: " + services);
        System.out.println("==================================");
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.findAll());
    }
}