package za.ac.cput.Group19CarWash.repository.upholstery.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Group19CarWash.domain.Car;
import org.junit.jupiter.api.MethodOrderer;
import za.ac.cput.Group19CarWash.domain.Upholstery;
import za.ac.cput.Group19CarWash.factory.UpholsteryFactory;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
class UpholsteryRepositoryTest {

    private static UpholsteryRepository repository = UpholsteryRepository.getUpholsteryList();
    private static Upholstery upholstery = UpholsteryFactory.createUpholstery("Seats","Leather", "Brown");

    @Test
    void a_create() {
        Upholstery creation = repository.create(upholstery);
        assertEquals(upholstery.getUpholsteryId(), creation.getUpholsteryId());
        System.out.println("Creating Upholstery:");
        System.out.println("Create: " + creation);
    }

    @Test
    void b_read() {
        Upholstery read = repository.read(upholstery.getUpholsteryId());
        Assertions.assertEquals(upholstery.getUpholsteryId(), read.getUpholsteryId());
        // assertNotNull(read);
        System.out.println("Displaying Upholstery");
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Upholstery updated = new Upholstery.Builder().copy(upholstery).setUpholstItem("Seats")
                .setUpholstColour("Brown")
                .setUpholstMaterial("Leather")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Display Upholstery");
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean working = repository.delete(upholstery.getUpholsteryId());
        assertFalse(working);
        System.out.println("Deleting the Booking Below:");
        System.out.println("Deleted: " + upholstery);
    }

    @Test
    void d_findAll() {
        System.out.println("Display Cars: ");
        System.out.println(repository.findAll());
    }
}