package day00_BootCamp;
import java.util.*;
public class CamelCase {

        public static String CamelCase(String str) {
            // code goes here
            str = str.toLowerCase();
            char[] charArray = str.toCharArray();

            for(int i = 0; i < charArray.length; i++) {

                if(!(charArray[i] <= 90 && charArray[i] >= 65 || charArray[i] <= 122 && charArray[i] >= 97)) {
                    charArray[i] = ' ';

                    if(charArray[i] == ' ' && charArray[i+1] <= 122 && charArray[i+1] >= 97){
                        charArray[i+1] -= 32;
                    }
                }
            }


            str = String.copyValueOf(charArray);
            str = str.replaceAll(" ", "");

            return str;
        }

        public static void main (String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print(CamelCase(s.nextLine()));
        }

}
