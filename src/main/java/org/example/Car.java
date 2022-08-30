package org.example;

import java.util.Random;

public class Car {
    private String carType;
    private boolean partsDelivered;

    public Car(String carType, boolean partsDelivered) {
        this.carType = carType;
        this.partsDelivered = partsDelivered;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public boolean isPartsDelivered() {
        return partsDelivered;
    }

    public void setPartsDelivered(boolean partsDelivered) {
        this.partsDelivered = partsDelivered;
    }
}
