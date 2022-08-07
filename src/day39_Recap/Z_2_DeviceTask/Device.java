package day39_Recap.Z_2_DeviceTask;

public class Device {
    private String brand;
    private String model;
    private double price;

    public static boolean hasBattery = true;
    public static boolean hasPowerButton = true;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Device(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }

    public void turnOn(){
        System.out.println("Turning on " + brand + " " + model);
    }

    public void turnOff(){
        System.out.println("Turning off " + brand + " " + model);
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
/*

Device Task:
	1. Create a class named Device:
			Variables:
					brand, model, price, hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero

			Methods:
				turnOn(), turnOff(), toString()


	2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)

	3. Create a subclass of Device named Computer:

				Add the extra methods if needed

	4. Create a subclass of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()

	5. Create the following subclasses of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia


	5. Create the following subclasses of Computer and add any extra methods that are needed:
				1. PersonalComputer
				1. Desktop
				2. Laptop


	6. Create a class named MyDevices:
			Create the objects of each subclasses and

			test all the functions of each objects

            Analyze the relationships between the classes





 */