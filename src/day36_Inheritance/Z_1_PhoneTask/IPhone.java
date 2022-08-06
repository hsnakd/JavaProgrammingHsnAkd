package day36_Inheritance.Z_1_PhoneTask;

public class IPhone extends PhoneClass {


    public IPhone(String model, String size, double price, String color) {
        super("iPhone", model, size, price, color);
    }

    public void faceTime (long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is face timing with  number " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getBrand() + " " + getModel() + " is face timing with  number " + email);
    }
}
/*
1.2 Create a subclass of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */