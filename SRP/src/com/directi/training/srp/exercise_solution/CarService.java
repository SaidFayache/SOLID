package com.directi.training.srp.exercise_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService
{
    private final List<Car> carsDb = Arrays.asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));

    public CarService(CarFormatter carFormatter){
        this.carFormatter = carFormatter;
    }
    private final CarFormatter carFormatter;

    public Car findById(String carId)
    {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarNames(){
        StringBuilder sb = new StringBuilder();
        for ( Car car : findAll()) {
            sb.append(carFormatter.format(car));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar(List<Car> cars)
    {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

    public List<Car> findAll()
    {
        return new ArrayList<>(carsDb);
    }

}
