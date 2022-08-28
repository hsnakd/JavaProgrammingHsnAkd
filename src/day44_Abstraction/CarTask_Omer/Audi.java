package day44_Tasks_Abstraction_Interface;

public class Audi extends Car implements AutoPark{

    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Please push the start button");
    }

    @Override
    public void drive() {
        System.out.println("Nice rides with " + getMake() + " " + getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " : Automatic parking feature enabled : " + AutoPark.hasAutoPark);
    }
}
/*
8. Create two subclass of Car named Audi &  Mercedes that implements AutoPark interface
 */