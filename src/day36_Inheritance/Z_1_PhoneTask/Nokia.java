package day36_Inheritance.Z_1_PhoneTask;

public class Nokia extends PhoneClass {
    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDefense () {
        System.out.println(getBrand() + " " + getModel() + " can be used for self defence");
    }



}

/*
1.4 Create a subclass of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */