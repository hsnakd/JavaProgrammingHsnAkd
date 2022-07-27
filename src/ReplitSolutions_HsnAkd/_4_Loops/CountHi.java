package ReplitSolutions_HsnAkd._4_Loops;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        String word = "hi";

        int count = 0;

        while(str.contains(word)){
            str = str.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);



    }
}

/*

Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2
Example:

input: hi code java please

output: 1

 */