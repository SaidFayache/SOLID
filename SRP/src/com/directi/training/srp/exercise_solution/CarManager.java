package com.directi.training.srp.exercise_solution;

public class CarManager
{
    private final CarService carService;

    public CarManager(CarService carService, CarFormatter carFormatter)
    {
        this.carService = carService;
    }

    public Car getCarById(final String carId)
    {
        return carService.findById(carId);
    }

    public String getCarsNames()
    {
        return carService.getCarNames();
    }

    public Car getBestCar()
    {
        return carService.getBestCar(carService.findAll());
    }
}
