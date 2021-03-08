package com.directi.training.srp.exercise_solution;

import java.util.List;

public class CarFormatter
{
    public String format(Car car)
    {
        StringBuilder sb = new StringBuilder();

            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
        return sb.toString();
    }
}
