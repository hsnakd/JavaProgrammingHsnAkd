package day35_Encapsulation.Z_2_RectangleTask;

public class RectangleObject {
    public static void main(String[] args) {
        RectangleClass rectangle1 = new RectangleClass(10,20);
        System.out.println(rectangle1);

        rectangle1.setWidth(5);
        rectangle1.setLength(10);
        System.out.println(rectangle1);

    }
}

/*
2. Rectangle Task:*
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should not be negative
							length of the rectangle should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement

 */
