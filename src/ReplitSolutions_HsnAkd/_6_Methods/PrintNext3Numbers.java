package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class PrintNext3Numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();

        System.out.println("next 3 are:");

        System.out.println(next3(num));
    }


    public static String next3 (int num){
        String result = "";

        for (int i = 1; i < 4; i++) {
            result += num + i + " ";
        }

        result = result.trim();



        return result;
    }
}

/*
Create a method called next3 .
This method has an int argument and prints the next 3 numbers after that number.
Call the method from main method and pass num to it.

flow:

enter number
1
next 3 are:
2 3 4
(put a space between numbers)
 */