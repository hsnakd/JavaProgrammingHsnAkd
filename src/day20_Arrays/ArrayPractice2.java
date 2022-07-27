package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */

        /*
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }
         */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }

        System.out.println(Arrays.toString(letters));  //[A~Z]


               char ch2 = 'Z';
        for (int i = 0; i < letters.length; i++, ch2--) {
            letters[i] = ch2;
        }

        System.out.println(Arrays.toString(letters));  //[A~Z]



        char ch3= 'A';
        for (int i = letters.length -1 ;  i >= 0; i--, ch3++) {
            letters[i] = ch3;
        }

        System.out.println(Arrays.toString(letters));  //[A~Z]




    }

}
