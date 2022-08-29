package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductionLine productionLine = new CrossProductionLine();
        AutoFactory autoFactory = new AutoFactory(5,productionLine);
        autoFactory.runProduction();
    }
}
