package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithReturn_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }

    public static int max(int x, int max){
        // Code here
        int result = 0;

        if (x > max) {
            System.out.println(x);
        } else if (x <= max) {
            System.out.println(max);
        }



        return result;
    }


}

/*
Finish the method max which has two parameters, x and max.

if x is bigger than max return x
if max is bigger than x return max
all other cases return x
Example:

max(1,10) -> 10
max(11,5) -> 11
 */