package day44_Abstraction.Z_1_CarTask;

public class CarShop {
    public static void main(String[] args) {
        Audi audi = new Audi("A5",2023,50000,"White");
        BMW bmw = new BMW("4.20", 2022,40000,"Gray");
        CydeoCar cydeoCar = new CydeoCar("SLX", 2026, 100000, "Blue");
        Honda honda = new Honda("Accord", 2021,30000, "Black");
        Mercedes mercedes = new Mercedes("CLA 200", 2023,60000, "Light Blue");
        Nio nio =new Nio("New Nio", 2024, 70000, "Orange");
        Tesla tesla = new Tesla("Tesla X", 2025,80000, "Red");
        Toyota toyota = new Toyota("Corolla", 2018, 20000, "White");

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(cydeoCar);
        System.out.println(honda);
        System.out.println(mercedes);
        System.out.println(nio);
        System.out.println(tesla);
        System.out.println(toyota);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        audi.autoPark();
        audi.drive();
        audi.start();

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        cydeoCar.fly();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.drive();
        cydeoCar.start();
        cydeoCar.stop();


        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

    }
}
/*
    11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes

 */