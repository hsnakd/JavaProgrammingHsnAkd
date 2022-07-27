package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_At3rdChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }

    public static String at3(String target,String word){
        String result = "";

        for (int i = 0; i <3 ; i++) {
            result += target.charAt(i);
        }
        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i);
        }
        for (int i = 3; i <target.length() ; i++) {
            result += target.charAt(i);
        }




        return result;
    }


}

/*
at3 accepts two strings and returns a string.

The first string is the one that will be manipulated.
At the 3rd char position of target you will insert the word argument.

Example:

at3("longword","foo")

return: "lonfoogword"
at3("blabla","a")

return: "blaabla"
 */