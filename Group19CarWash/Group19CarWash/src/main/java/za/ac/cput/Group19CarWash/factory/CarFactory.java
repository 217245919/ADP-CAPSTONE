package za.ac.cput.Group19CarWash.factory;

/*
    Wajedien Samuels (216287820)
 */

import za.ac.cput.Group19CarWash.domain.Car;

public class CarFactory {
    public static Car createCar(String carModel, String carColour){

        //Long Id = Helper.generateId();
        //String carRegId = Helper.generateCarRegId();
        Car car = new Car.Builder()
                .setCarModel(carModel)
                .setCarColour(carColour)
                .build();
        return car;
    }
}
