package za.ac.cput.Group19CarWash.repository.administrator.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Administrator;
import za.ac.cput.Group19CarWash.factory.AdministratorFactory;

import static org.junit.jupiter.api.Assertions.*;

class AdministratorRepositoryIMPLTest {

    private static AdministratorRepositoryIMPL repository = AdministratorRepositoryIMPL.getAdministratorList();
    private static Administrator administrator = AdministratorFactory.createAdministrator("A102", "John", "Smith", "A102");

    @Test
    void a_create() {
        Administrator created = repository.create(administrator);
        assertEquals(administrator.getAdminId(), created.getAdminId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Administrator read = repository.read(administrator.getAdminId());
        Assertions.assertEquals(administrator.getAdminId(), read.getAdminId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Administrator updated = new Administrator.Builder().copy(administrator)
                .setAdminId("A102.1")
                .setAdminFname("Jan")
                .setAdminSname("Smit")
                .setBookingId("A102.1")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean working = repository.delete(administrator.getAdminId());
        assertFalse(working);
        System.out.println("Deleting the Booking Below:");
        System.out.println("Deleted: " + administrator);
        System.out.println("==================================");
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.findAll());
    }
}