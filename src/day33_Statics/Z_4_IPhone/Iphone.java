package day33_Statics.Z_4_IPhone;


public class Iphone {

    public String model;
    public double price;
    public String  color;
    public String size;


    public static String  brand;
    public static String OS;
    public static String madeIn;

    public Iphone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model + " is face timing with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model + " is face timing with " + email);
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling with " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model + " is texting with " + phoneNumber);
    }


    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}


/*
4. IPhone Task:
		1. Create a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()


 */