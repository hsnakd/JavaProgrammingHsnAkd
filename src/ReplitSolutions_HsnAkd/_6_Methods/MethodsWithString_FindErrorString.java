package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithString_FindErrorString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));
    }


    public static boolean isError(String line) {
        boolean result = false;
        String error = "error";
        int count = 0;

        for (int i = 0; i <5 ; i++) {
            if (line.charAt(i) == error.charAt(i)) {
                count++;
            }
        }

        if (count == 5) {
            result = true;
        }




        return result;
    }

}

/*
The isError method checks if the given String begins with error

The method will return true if the String starts with error otherwise it will return false
Example:

isError("foo bar")
returns : false

isError("error foo bar")
returns : true

isError("error one two")
returns : true

isError("three four error")
returns : false

 */