package za.ac.cput.Group19CarWash.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Services;

import static org.junit.jupiter.api.Assertions.*;

class ServicesFactoryTest {

    @Test
    void createServices() {
        Services services = ServicesFactory.createServices("1", "Full Service", "1", "1", "1", "1", "R400");
        System.out.println(services);
    }
}