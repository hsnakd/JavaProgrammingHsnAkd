package ReplitSolutions_HsnAkd._4_Loops;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();


        String word1 = "java";

        int count = 0;

        while(word.contains(word1)){
            word = word.replaceFirst(word1, "");
            count++;
        }
        System.out.println(count);



    }
}

/*

Print the number of times that the string "java" appears anywhere in the given string word

Example:

input: javaxjava

output: 2
Example:

input: javaxjavaapplepearjavaegg

output: 3

 */