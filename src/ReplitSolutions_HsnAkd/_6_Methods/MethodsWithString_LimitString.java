package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_LimitString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(limit(in.nextLine(), in.nextInt()));
    }

    public static String limit(String text, int maxLength){
        String result = "";

        for (int i = 0; i <maxLength ; i++) {
            result += text.charAt(i);
        }






        return result;
    }

}

/*
This method gets a string and an int, it returns a string.

The method will limit the given String by a certain amount of characters(given int)

Examples:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

 */