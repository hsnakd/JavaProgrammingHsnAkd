package day44_Abstraction.Z_2_DeviceTask;

public class Laptop extends Computer{

    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
/*

	8. Create the following subclasses of Computer and add any extra methods that are needed:
				1. PersonalComputer:
				1. Desktop
				2. Laptop
 */