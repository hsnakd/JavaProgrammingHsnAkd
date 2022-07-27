package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        char character = '-';


        if (character >= '0' && character <= '9') {
            System.out.println("Digit");
        } else  if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            System.out.println("Alphabetic Character");
        } else {
            System.out.println("Special Character");
        }

        System.out.println("--------------------------------------------------");

        char character2 = 65;


        if (character2 >= 48 && character2 <= 57) {
            System.out.println("Digit");
        } else  if ((character2 >= 65 && character2 <= 90) || (character2 >= 97 && character2 <= 122)) {
            System.out.println("Alphabetic Character");
        } else {
            System.out.println("Special Character");
        }

        System.out.println("--------------------------------------------------");
    }

}
/*
4. Create a class called Character Identity, and write a program that can identify if
the given character is a digit or Alphabetic Character(A~Z_5_UniqueChar or a~Z_5_UniqueChar) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

 */