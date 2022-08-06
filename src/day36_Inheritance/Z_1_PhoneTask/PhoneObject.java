package day36_Inheritance.Z_1_PhoneTask;


public class PhoneObject {
    public static void main(String[] args) {
        IPhone iPhone1 = new IPhone("13 Pro", "Max",1000,"Black");
        Nokia nokia1 = new Nokia("Q", "Mini", 100, "Red");
        Samsung samsung1 = new Samsung("S10", "Medium",750,"White");

        System.out.println(iPhone1);
        System.out.println(nokia1);
        System.out.println(samsung1);

        iPhone1.setModel("14 Pro");
        iPhone1.getModel();
        iPhone1.faceTime(123456789);
        iPhone1.faceTime("mail@mail.com");
        iPhone1.call(123456789);
        iPhone1.text(123456789);
        nokia1.selfDefense();
        samsung1.freeze();

    }



}

/*
		1.5 Create a class named Phone Objects and test of the subclass' objects
 */