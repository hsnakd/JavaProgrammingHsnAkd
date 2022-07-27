
package ReplitSolutions_HsnAkd._3_Strings;
import java.util.Scanner;

public class PrefixAgain2 {
    public static void main(String[] args) {

       String str = "Hasan";
int n = 2;

        String repeat2 = str.substring(0,n);

        boolean result = str.substring(n).contains(repeat2);

        System.out.println("repeat2 = " + repeat2);
        System.out.println("result = " + result);



    }

}

