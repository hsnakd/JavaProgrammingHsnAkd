package day44_Abstraction.Z_2_DeviceTask;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println(phoneNum + " is calling");
    }

    public void text(long phoneNum){
        System.out.println(phoneNum + " is texting");
    }



}

/*
        2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

 */