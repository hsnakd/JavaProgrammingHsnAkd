package day39_Recap.Z_2_DeviceTask;

public class TV extends Device {
    public TV(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void channelUp(){
        System.out.println(getBrand() + " " + getModel() + " is channeling up");
    }

    public void channelDown(){
        System.out.println(getBrand() + " " + getModel() + " is channeling down");
    }
}
/*
4. Create a subclass of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()

 */