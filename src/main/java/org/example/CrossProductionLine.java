package org.example;

import java.util.Random;

public class CrossProductionLine implements ProductionLine{
    @Override
    public Car work() {
        Random random = new Random();
        return new Car("CROSS", random.nextBoolean());
        }
}
