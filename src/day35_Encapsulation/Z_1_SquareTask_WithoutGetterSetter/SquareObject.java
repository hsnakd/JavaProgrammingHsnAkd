package day35_Encapsulation.Z_1_SquareTask_WithoutGetterSetter;

public class SquareObject {
    public static void main(String[] args) {

        SquareClass square1 = new SquareClass(10);
        SquareClass square2 = new SquareClass(-10);
        System.out.println(square1);
        System.out.println(square2);


        System.out.println("Area : " + square1.calcArea());
        System.out.println("Perimeter : " + square1.calcPerimeter());


    }
}
