package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer number");
        int integer = input.nextInt();

        System.out.println("Enter a decimal number");
        double decimal = input.nextDouble();

        double multi = integer * decimal;

        System.out.println("integer = " + integer);
        System.out.println("decimal = " + decimal);
        System.out.println("multi = " + multi);


    }
}
