package day43_Abstraction.ShapeTask_HsnAkd;

public class ShapeObject {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        Rectangle rectangle = new Rectangle("Rectangle", 5,10);
        Square square = new Square("Square", 5);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);


    }
}
