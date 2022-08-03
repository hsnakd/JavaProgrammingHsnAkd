package day35_Encapsulation.Z_1_SquareTask_WithoutGetterSetter;

public class SquareClass {
    private double side;

    public SquareClass(double side) {
        if (side <= 0) {
            return;
        }
        this.side = side;
    }

    public double calcArea(){
        return side * side;
    }

    public double calcPerimeter(){
        return side * 4;
    }

    public String toString() {
        return "SquareClass{" +
                "side=" + side +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*

Our side variable's access modifier is private. In the recorded video we set the requirements in the setter method.
In this example I didn't use getter and setter methods, and I set requirement in the constructor.
In this situation I can use side variable in the "SquareObject" class. My requirement is also work (square2) .

Maybe I misunderstood but in recorded video Muhtar said "We never use private data in the other classes, and we use private date for giving a requirement"

1. Square Task:*
		1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement


 */