package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your fist name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        char fN = firstName.charAt(0);
        char lN = lastName.charAt(0);
        String initial = "" + fN + lN;
        System.out.println(initial);





    }
}
