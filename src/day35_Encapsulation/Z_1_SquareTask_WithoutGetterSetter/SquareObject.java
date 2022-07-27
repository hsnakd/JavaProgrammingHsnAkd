package day35_Encapsulation.Z_1_SquareTask_WithoutGetterSetter;

public class SquareObject {
    public static void main(String[] args) {

        SquareClass square1 = new SquareClass(-10);
        System.out.println(square1);

        square1.calcArea();
        square1.calcPerimeter();




    }
}
