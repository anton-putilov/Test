package org.example;

import java.util.Random;

public class SedanProductionLine implements ProductionLine{
    @Override
    public Car work() {
        Random random = new Random();
        return new Car("SEDAN", random.nextBoolean());
    }
}
