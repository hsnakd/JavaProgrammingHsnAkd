package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class Printing03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        // DO NOT TOUCH ABOVE

        String result = "";
        for (int i = 0; i < 4; i++) {
            result = arr[i] + ", " + arr[i+1] + ", " + arr[i+2];
            System.out.print(result);
            System.out.println();
        }


    }
}

/*
The code provided in your main method will take in six Strings and save them into an array arr.

Print out the 3 neighboring items of the array in one line until the last line
each line should contain 3 neighboring items of array element as displayed below

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda"]

Output:
apple, banana, kiwi
banana, kiwi, grape
kiwi, grape, milk
grape, milk, soda
 */
