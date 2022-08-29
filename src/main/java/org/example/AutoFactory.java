package org.example;

public class AutoFactory {
    private int productionSize;
    private ProductionLine productionLine;

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionSize = productionSize;
        this.productionLine = productionLine;
    }

    public void runProduction(){
        int carsBuilt = 0;
        while (carsBuilt < productionSize){
            productionLine.work();
            carsBuilt++;
        }
    }
}
