package day35_Encapsulation.Z_0_Circle;

public class CircleObject {
    public static void main(String[] args) {
        CircleClass circle1 = new CircleClass(5);

        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());
    }
}
/*
Task
2. Create a class named Circle

			private variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()
 */
