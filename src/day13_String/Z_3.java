package day13_String;

import java.util.Scanner;

public class Z_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();





        // TASK_3

        char ch3 = word.charAt(0);
        char n3 = word.charAt(word.length()-1);

        if (ch3 == n3){
            System.out.println("equal");
        }



    }
}


/*

3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same


 */

        
