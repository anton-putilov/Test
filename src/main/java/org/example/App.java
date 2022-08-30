package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Car> listCar;
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AutoFactory autoFactory = ctx.getBean("autoFactory", AutoFactory.class);
        autoFactory.runProduction();
        listCar = autoFactory.getListCar();
        for (int i=0; i < listCar.size(); i++){
            System.out.println(listCar.get(i).getCarType()+":"+listCar.get(i).isPartsDelivered());
        }
        System.out.println(autoFactory.getCarsBuilt());
    }
}
