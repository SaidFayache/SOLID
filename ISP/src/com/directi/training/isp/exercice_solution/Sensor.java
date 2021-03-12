package com.directi.training.isp.exercise_solution;

import java.util.Random;

public class Sensor
{
    public void register(SensedElement sensedElement)
    {
        while (true) {
            if (isPersonClose()) {
                sensedElement.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() { return new Random().nextBoolean(); }
}