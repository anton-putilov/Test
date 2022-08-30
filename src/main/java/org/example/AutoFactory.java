package org.example;

import java.util.ArrayList;

public class AutoFactory {
    private int productionSize;
    private ProductionLine productionLine;
    private ArrayList<Car> listCar;
    private int carsBuilt;

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
        this.listCar = new ArrayList<>();
    }

    public void runProduction(){
        int i = 0;
        while (i < productionSize){
            listCar.add(productionLine.work());
            if (this.checkCar(listCar.get(i))==true){
                this.carsBuilt++;
            }
            i++;
        }
    }

    private boolean checkCar(Car car){
        return car.isPartsDelivered();
    }

    public int getCarsBuilt() {
        return carsBuilt;
    }

    public ArrayList<Car> getListCar() {
        return listCar;
    }
}
