package day03_EscapeSequences;
import  java.util.Scanner;

public class Timer2 {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Minutes");
        int minutes=scan.nextInt();
        scan.close();

        for (int i=minutes; i>0; --i) {
            if (i<0) {
                break;
            }
            for (int z=59; z>=0; --z) {
                System.out.println("\r" + (i-1) + "minutes and "+z+" seconds left");
                Thread.sleep(1000);

            }
        }
        System.out.println("\n\n");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                         *");
        System.err.println("\t\t\t*                     Time is up                          *");
        System.err.println("\t\t\t*                                                         *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");




    }


}
