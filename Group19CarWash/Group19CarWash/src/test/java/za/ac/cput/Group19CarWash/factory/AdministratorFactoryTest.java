package za.ac.cput.Group19CarWash.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Administrator;

import static org.junit.jupiter.api.Assertions.*;

class AdministratorFactoryTest {

    @Test
    void createAdministrator() {
        Administrator administrator = AdministratorFactory.createAdministrator("A101", "John", "Smith", "A101");
        System.out.println(administrator);
    }
}