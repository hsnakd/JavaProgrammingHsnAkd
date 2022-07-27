package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        /*
                +: Addition     -: Subtract       *: Multiplication     /: Division
        */
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int modulus = number1 % number2;

        System.out.println("addition = " + addition);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);
        System.out.println("modulus = " + modulus);
    }




}
