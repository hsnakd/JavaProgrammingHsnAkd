package day35_Encapsulation.Z_0_Circle;

public class CircleClass {
    private double radius;

    public static double pi;

    static {
        pi = Math.PI;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            return;
        }
        this.radius = radius;
    }

    public CircleClass(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return pi * radius * radius;
    }
    public double calcPerimeter() {
        return 2 * pi * radius;
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

 			Add a constructor that can set the radius of circle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()
 */
