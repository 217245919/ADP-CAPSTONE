package za.ac.cput.Group19CarWash.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import za.ac.cput.Group19CarWash.domain.Bookings;
import za.ac.cput.Group19CarWash.domain.Car;
import za.ac.cput.Group19CarWash.domain.Customer;
import za.ac.cput.Group19CarWash.domain.Services;
import za.ac.cput.Group19CarWash.services.BookingService;
import za.ac.cput.Group19CarWash.services.CarService;
import za.ac.cput.Group19CarWash.services.CustomerService;
import za.ac.cput.Group19CarWash.services.ServicesService;

import java.util.List;

@Controller
public class AllBookingConrtroller {

    @GetMapping(value= "/allbookings")
    public String allbookings(Model model){
        List<Bookings> bookingsList = BookingService.findAllBookings();
        List<Customer> customerList = CustomerService.findAllCustomers();
        List<Car> carList = CarService.findAllCars();
        List<Services> servicesList = ServicesService.findAllServices();
        model.addAttribute("bookingsList", bookingsList);
        model.addAttribute("customerList", customerList);
        model.addAttribute("carList", carList);
        model.addAttribute("servicesList", servicesList);


        return "all_bookings";
    }
}
