package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }

    public static String reverse(String input){
        String result = "";


        for (int i = input.length()-1; i >= 0; i--) {
            result += input.charAt(i);
        }





        return result;
    }

}

/*
The reverse method will reverse the given String

Example:

reverse("foo") ==> "oof"
reverse("student") ==> "tneduts"
 */