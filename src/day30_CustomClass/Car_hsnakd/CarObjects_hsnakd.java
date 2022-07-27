package day30_CustomClass.Car_hsnakd;

import day30_CustomClass.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects_hsnakd {

    public static void main(String[] args) {

        Car_hsnakd car1 = new Car_hsnakd();

        car1.setInfo("Audi", "A5", "White", 2022, 3000000 );
        System.out.println(car1);


        car1.start();
        car1.drive();
        car1.stop();


    }
}

/*
Car Tester:

	Attributes:
		brand, model, color, year, price

	Actions:
		drive(), start(), stop(), toString(), setInfo()

 */