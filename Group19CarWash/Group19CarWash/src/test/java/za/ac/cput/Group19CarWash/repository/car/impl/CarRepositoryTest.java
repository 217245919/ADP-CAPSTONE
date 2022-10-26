package za.ac.cput.Group19CarWash.repository.car.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Group19CarWash.domain.Car;
import org.junit.jupiter.api.MethodOrderer;
import za.ac.cput.Group19CarWash.factory.CarFactory;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
class CarRepositoryTest {

    private static CarRepository repository = CarRepository.getCarList();
    private static Car car = CarFactory.createCar("Toyota","Blue");

    @Test
    void a_create() {
        Car creation = repository.create(car);
        assertEquals(car.getCarRegId(), creation.getCarRegId());
        System.out.println("Creating Car:");
        System.out.println("Create: " + creation);
    }

    @Test
    void b_read() {
        Car read = repository.read(car.getCarRegId());
        Assertions.assertEquals(car.getCarRegId(), read.getCarRegId());
        // assertNotNull(read);
        System.out.println("Displaying Car");
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Car updated = new Car.Builder().copy(car).setCarColour("Blue")
                .setCarModel("Toyota")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Display Car");
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean working = repository.delete(car.getCarRegId());
        assertFalse(working);
        System.out.println("Deleting the Booking Below:");
        System.out.println("Deleted: " + car);
    }

    @Test
    void d_findAll() {
        System.out.println("Display Cars: ");
        System.out.println(repository.findAll());
    }
}