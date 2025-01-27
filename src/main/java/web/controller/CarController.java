package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.CarService.CarServiceImp;


@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarServiceImp carService;
    @Autowired
    public CarController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping
    public String listCar(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("cars",carService.listCar(count));
        return "cars";
    }
}
