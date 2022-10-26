package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.CarDelivery;
import za.ac.cput.Group19CarWash.services.CarDeliveryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping
public class CarDeliveryController {
    @Autowired
    private CarDeliveryService carDeliveryService;

    @GetMapping(value = "/carDelivery")
    public String carDeliveries(Model model) {
        List<CarDelivery> carDeliveryList = CarDeliveryService.findAllCarDeliveries();
        model.addAttribute("carDeliveryList", carDeliveryList);

        return "carDelivery";
    }

    @RequestMapping(value = "/newCarDelivery")
    public String showNewCarDelivery(Model model) {
        CarDelivery carDelivery = new CarDelivery();
        model.addAttribute("carDelivery", carDelivery);

        return "new_carDelivery";
    }

    @RequestMapping(value = "/saveCarDelivery", method = RequestMethod.POST)
    public String saveCarDelivery(@ModelAttribute("carDelivery") CarDelivery carDelivery) {
        carDeliveryService.addCarDelivery(carDelivery);

        return "redirect:/carDelivery";
    }

    @GetMapping(value = "/findCarDelivery/{id}")
    public ResponseEntity<CarDelivery> getCarDeliveryById(@PathVariable("id") Long id) {
        CarDelivery carDelivery = carDeliveryService.findCarDeliveryById(id);
        return new ResponseEntity<>(carDelivery, HttpStatus.OK);
    }

    @RequestMapping(value = "/editCarDelivery/{id}")
    public ModelAndView showEditCarDelivery(@PathVariable(name = "id") Long id) {
        ModelAndView editing = new ModelAndView("edit_carDelivery");
        CarDelivery carDelivery = carDeliveryService.findCarDeliveryById(id);
        editing.addObject("carDelivery", carDelivery);

        return editing;
    }

    @DeleteMapping(value = "/deleteCarDelivery/{id}")
    public String deleteMyCarDelivery(@PathVariable(name = "id") Long id) {
        carDeliveryService.deleteCarDelivery(id);

        return "redirect:/carDelivery";
    }

}
