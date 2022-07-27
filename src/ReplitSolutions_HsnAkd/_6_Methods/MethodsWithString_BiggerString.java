package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_BiggerString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(bigger(in.next(), in.next()));
    }


    public static String bigger(String a ,String b){

        String result = "";

        if (a.length() > b.length()) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

}

/*
The method accepts two strings and return the longest one

Example":

bigger("apple","orange") ==> "orange"
 */