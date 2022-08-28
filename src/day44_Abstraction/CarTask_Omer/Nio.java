package day44_Tasks_Abstraction_Interface;

public class Nio extends Car implements AutoPilot, AutoPark {
    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Please clap to start");
    }

    @Override
    public void drive() {
        System.out.println("Comfortable driving with " + getMake() + " " + getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " : Automatic parking is our job : " + AutoPark.hasAutoPark);
    }

    @Override
    public void selfDrive() {
        System.out.println("Are you ready for a fantastic driving experience?" + AutoPilot.hasAutoPilot);
    }
}
/*
9. Create Two subclasses of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces
 */