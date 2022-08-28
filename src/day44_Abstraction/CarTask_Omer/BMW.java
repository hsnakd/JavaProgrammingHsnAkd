package day44_Tasks_Abstraction_Interface;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Please open the window first");
    }

    @Override
    public void drive() {
        System.out.println("Safe rides with " + getMake() + " " + getModel());
    }
}
/*
7. Create a subclass of Car named BMW
 */