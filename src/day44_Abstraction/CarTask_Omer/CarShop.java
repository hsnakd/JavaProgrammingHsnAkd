package day44_Tasks_Abstraction_Interface;

public class CarShop {
    public static void main(String[] args) {

        CydeoCar cydeoCar = new CydeoCar("Unlimited", 2022, 200000, "Blue");
        System.out.println(cydeoCar);
        cydeoCar.drive();
        cydeoCar.start();
        cydeoCar.stop();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();

        System.out.println("-----------------------------------------------------");

        Nio nio = new Nio("New", 2021, 100000, "Red");
        System.out.println(nio);
        nio.drive();
        nio.start();
        nio.stop();
        nio.autoPark();
        nio.selfDrive();

        System.out.println("-----------------------------------------------------");

        Tesla tesla = new Tesla("ModelS", 2020, 90000, "White");
        System.out.println(tesla);
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.autoPark();
        tesla.selfDrive();

        System.out.println("-----------------------------------------------------");

        Mercedes mercedes = new Mercedes("E500", 2019, 45000, "Black");
        mercedes.drive();
        mercedes.start();
        mercedes.stop();
        mercedes.autoPark();

        System.out.println("-----------------------------------------------------");

        Audi audi = new Audi("Q7", 2018, 40000, "Silver");
        audi.drive();
        audi.start();
        audi.stop();
        audi.autoPark();

        System.out.println("-----------------------------------------------------");

        BMW bmw = new BMW("M5", 2017, 35000, "Orange");
        bmw.drive();
        bmw.start();
        bmw.stop();

        System.out.println("-----------------------------------------------------");

        Honda honda = new Honda("Accord", 2014, 30000, "Pink");
        honda.drive();
        honda.start();
        honda.stop();

        System.out.println("-----------------------------------------------------");

        Toyota toyota = new Toyota("Corolla", 2013, 20000, "Green");
        toyota.drive();
        toyota.start();
        toyota.stop();







    }
}
