package day36_Inheritance.Z_1_PhoneTask;

public class Samsung extends PhoneClass{
    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze () {
        System.out.println(getBrand() + " " + getModel() + " can be freeze");
    }
}

/*
1.3 Create a subclass of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */