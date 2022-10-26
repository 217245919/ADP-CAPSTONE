package za.ac.cput.Group19CarWash.factory;

/*
Mogammad-Redar Behardien 
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
CarDeliveryFactory.java
**************** DO NOT TOUCH ********************
 */

import za.ac.cput.Group19CarWash.domain.CarDelivery;

public class CarDeliveryFactory {
    public static CarDelivery createCarDelivery(String carDelivId, String date, String time, String customerId) {// String
                                                                                                                 // carDelivId,
        CarDelivery carDelivery = new CarDelivery.Builder()
                .setCarDelivId(carDelivId)
                .setDate(date)
                .setTime(time)
                .setCustomerId(customerId)
                .build();
        return carDelivery;
    }
}