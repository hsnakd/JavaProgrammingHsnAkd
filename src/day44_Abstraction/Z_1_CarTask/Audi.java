package day44_Abstraction.Z_1_CarTask;

public class Audi extends Car implements AutoPark{

    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Has " + getMake() + getModel() + " start feature");
    }

    @Override
    public void drive() {
        System.out.println("Has " + getMake() + getModel() + " drive feature");
    }

    @Override
    public void autoPark() {
        System.out.println("Has " + getMake() + getModel() + " auto park feature");
    }
}

/*
    5. Create a subclass of Car named Toyota

	6. Create a subclass of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two subclass of Car named Audi &  Mercedes that implements AutoPark interface

	9. Create Two subclasses of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

	10 Create a subclass of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces

 */