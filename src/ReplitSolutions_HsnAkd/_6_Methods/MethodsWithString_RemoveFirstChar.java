package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_RemoveFirstChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
    }


    public static String removeFirst(String target) {

        String result = "";
        for (int i = 1; i <target.length() ; i++) {
            result += target.charAt(i);
        }






        return result;
    }

}

/*
The method accepts a string and returns a string without the first character

Example:

removeFirst("aaa")

returns "aa"

 */