package za.ac.cput.Group19CarWash.repository.location;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Group19CarWash.domain.Bookings;
import za.ac.cput.Group19CarWash.domain.Location;
import za.ac.cput.Group19CarWash.factory.BookingsFactory;
import za.ac.cput.Group19CarWash.factory.LocationFactory;
import za.ac.cput.Group19CarWash.repository.BookingsRepoIMPL;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class LocationRepoIMPLTest {

    private static LocationRepoIMPL repository = LocationRepoIMPL.getLocationList();
    private static Location location = LocationFactory.createLocation("DalaChopHom","0645523366", "5200");

    @Test
    void create() {
        Location created = repository.create(location);
        assertEquals(location.getBranchId(), created.getBranchId());
        System.out.println("Creating Location Details Below:");
        System.out.println("Create: " + created);
        System.out.println("==================================");
    }

    @Test
    void read() {
        Location read = repository.read(location.getBranchId());
        Assertions.assertEquals(location.getBranchId(), read.getBranchId());
        // assertNotNull(read);
        System.out.println("Displaying Location Details Below");
        System.out.println("Read: " + read);
        System.out.println("==================================");
    }

    @Test
    void update() {
        Location updated = new Location.Builder().copy(location).setBranchName("Doos")
                .setBranchId("6400")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Display updated Location Details of Branch Name + BranchId");
        System.out.println("Updated: " + updated);
        System.out.println("==================================");
    }

    @Test
    void delete() {
        boolean working = repository.delete(location.getBranchId());
        assertFalse(working);
        System.out.println("Deleting the Location Below:");
        System.out.println("Deleted: " + location);
        System.out.println("==================================");
    }

    @Test
    void findAll() {
        System.out.println("Display All Locations: ");
        System.out.println(repository.findAll());
        System.out.println("===================================");
    }
}