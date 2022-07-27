package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithReturn_3Locks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
    }

    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        boolean result = false;

        if (a == true && b == true) {
            result = true;
        } else if (c == true) {
            result = true;
        }

        return result;
    }//end threeLocks
}

/*
threeLocks accepts 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

Hint: See truth table
 */