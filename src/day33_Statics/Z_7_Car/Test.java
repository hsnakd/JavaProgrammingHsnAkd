package day33_Statics.Z_7_Car;


public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", "3", "Red", 2011, 50000);

        System.out.println(car1);
        car1.drive();



    }
}
/*
7. Car Task:
		1. Create a class called Car
            Attributes:
                 instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats

            Add a constructor to initialize all the fields

           Methods:
                drive()
                toString()

 */