package day31_Constructors.Z_5_Carpet;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(10,20,100,true);
        System.out.println(carpet1);
    }
}


/*
5. Carpet Task:
	5.1create a custom class for the Carpet class that should contain the following:
        instance variables:
            width, length, unitPrice, isPersian (boolean)

		Add a constructor to set all the instances

            instance methods:

                calcCost(): should be able to calculate total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet
                            including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitPrice

            if the carpet is persian  carpet, add 200$ to the totalPrice


 */