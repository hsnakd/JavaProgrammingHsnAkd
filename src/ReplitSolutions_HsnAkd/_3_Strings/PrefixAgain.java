package ReplitSolutions_HsnAkd._3_Strings;
import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        char ch = str.charAt((n-1));
        int repeat = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch) {
                repeat++;
            }
        }
        if (repeat >=2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        String repeat2 = str.substring(0,n);

        boolean result = str.substring(n).contains(repeat2);

        System.out.println(result);




    }

}

