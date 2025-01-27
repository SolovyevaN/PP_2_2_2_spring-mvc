package web.CarService;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars = Arrays.asList(
            new Car("Toyota Camry", "White", 2020),
            new Car("BMW X5", "Black", 2019),
            new Car("Tesla Model 3", "Red", 2022),
            new Car("Mercedes-Benz C-Class", "Silver", 2021),
            new Car("Audi A6", "Blue", 2018)
    );

    public List<Car> listCar(int count) {
        if (count >= cars.size()) {
            return cars; // Возвращаем весь список, если count >= 5
        }
        return cars.subList(0, count); // Возвращаем указанное количество машин
    }
}
