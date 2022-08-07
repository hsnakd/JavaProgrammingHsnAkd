package day39_Recap.Z_2_DeviceTask;

public class Iphone extends Phone {
    public Iphone(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void faceTime(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is face timing with " + phoneNum);
    }

    public void faceTime(String email){
        System.out.println(getBrand() + " " + getModel() + " is face timing with " + email);
    }


}
/*
5. Create the following subclasses of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia

 */