package day04_Variables;

public class Circle {


    public static void main(String[] args) {

        double radius = 5.5;
        double diameter = 2 * radius;
        double area = Math.PI * radius * radius;
        double perimeter =  Math.PI * diameter;


        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }

}
