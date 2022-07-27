package day14_String;

import java.util.Scanner;

public class Z_4_ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first words:");
        String word1 = input.nextLine();

        System.out.println("Enter second words:");
        String word2 = input.nextLine();

        char ch1 = word1.charAt(word1.length()-1);
        char ch2 = word2.charAt(0);

        String chL = String.valueOf(ch1);
        String chF = String.valueOf(ch2);


        if (chL.equals(chF)){
            word2 = word2.substring(1);
            System.out.println(word1+word2);
        }


    }
}


/*


    4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight



 */