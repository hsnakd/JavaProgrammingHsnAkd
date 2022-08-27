package day44_Abstraction.Z_2_DeviceTask;

public abstract class Computer extends Device {


    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
}

/*

	3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed

 */