package za.ac.cput.Group19CarWash.factory.location;

import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Bookings;
import za.ac.cput.Group19CarWash.domain.Location;
import za.ac.cput.Group19CarWash.factory.LocationFactory;

import static org.junit.jupiter.api.Assertions.*;

class LocationFactoryTest {

    @Test
    void createLocation() {
        Location location = LocationFactory.createLocation("521","0645523366", "47001");
        assertNotNull(location);
        System.out.println(location);
    }
}