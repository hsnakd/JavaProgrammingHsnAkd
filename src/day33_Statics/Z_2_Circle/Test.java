package day33_Statics.Z_2_Circle;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5);
        System.out.println(circle1);


    }
}
/*
2. Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement


 */