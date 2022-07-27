package day15_ForLoop;

public class Z_8_Palindrome {

    public static void main(String[] args) {

        String word = "civic-racecar-racecar-civic";

        String reversed = "";

        for (int i = word.length()-1;  i >=0 ; i--) {
             reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);


    }

}

/*

	8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true



 */