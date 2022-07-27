package day33_Statics.Z_4_IPhone;

public class Test {
    public static void main(String[] args) {
        Iphone iPhone1 = new Iphone("6", 1000, "Black", "4.7");
        System.out.println(iPhone1);

        iPhone1.faceTime(555555555);
        iPhone1.faceTime("melike@gmail.com");
        iPhone1.call(555555555);
        iPhone1.text(555555555);

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