package day39_Recap.Z_2_DeviceTask;

public class Phone extends Device {

    public Phone(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void call(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is calling with " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting with " + phoneNum);
    }
}
/*
2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)
 */