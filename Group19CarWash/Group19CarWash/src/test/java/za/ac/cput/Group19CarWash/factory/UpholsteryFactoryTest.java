package za.ac.cput.Group19CarWash.factory;

/*
    Wajedien Samuels (216287820)
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Upholstery;

import static org.junit.jupiter.api.Assertions.*;

class UpholsteryFactoryTest {

    @Test
    void createUpholstery(){
        Upholstery upholstery = UpholsteryFactory.createUpholstery("seats", "leather", "brown");
        System.out.println(upholstery);
    }

}