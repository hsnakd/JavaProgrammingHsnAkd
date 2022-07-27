package day28_ArrayList;

import java.util.ArrayList;

public class Z_12_DigitLetterSpecialCharacter {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> ch = new ArrayList<>();
        ArrayList<Character> listDigit = new ArrayList<>();
        ArrayList<Character> listLetter = new ArrayList<>();
        ArrayList<Character> listSpecCh = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {
            ch.add( str.charAt(i) );
        }

        for (int i = 0; i < ch.size(); i++) {
            if (Character.isDigit(ch.get(i)) ) {
                listDigit.add(ch.get(i));
            }
        }
        for (int i = 0; i < ch.size(); i++) {
            if (Character.isLetter(ch.get(i)) ) {
                listLetter.add(ch.get(i));
            }
        }
        for (int i = 0; i < ch.size(); i++) {
            if (!Character.isLetterOrDigit(ch.get(i)) ) {
                listSpecCh.add(ch.get(i));
            }
        }


        System.out.println(listDigit);
        System.out.println(listLetter);
        System.out.println(listSpecCh);

    }

}
/*
	3. Write a program that can extract the special characters,
	digits and letters from a string and stores them into separate ArrayLists of Characters

				Ex:
					str = "ABCD123$%#@&456EFG!"

				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}
 */
