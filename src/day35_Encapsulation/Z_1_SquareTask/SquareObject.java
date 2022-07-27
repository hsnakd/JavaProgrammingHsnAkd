package day35_Encapsulation.Z_1_SquareTask;

public class SquareObject {
    public static void main(String[] args) {

        SquareClass square1 = new SquareClass(5);
        System.out.println(square1);

        System.out.println("Square : " + square1.calcArea());
        System.out.println("Perimeter : " + square1.calcPerimeter());

        square1.setSide(10);
        System.out.println("New side value : " + square1.getSide());

        System.out.println(square1);





    }
}
