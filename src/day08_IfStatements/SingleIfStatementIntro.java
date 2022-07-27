package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
        System.out.println("--------------------------------");

    int number = 300;

    if (number % 2 == 0) {
        System.out.println(number + " is Even Number");
    }
        if (number % 2 == 1) {
            System.out.println(number + " is Odd Number");
        }

        System.out.println("--------------------------------");

        int number2 = 101;
        boolean evenNumber = number2%2 == 0;
        boolean oddNumber = !evenNumber; // not even number

        if(evenNumber){ // false
            System.out.println(number2+" is Even Number");
        }

        if(oddNumber){// true
            System.out.println(number2+" is Odd Number");
        }


        System.out.println("--------------------------------");



        int number3 = -10;
        if (number3 > 0) {
            System.out.println(number3 + " is positive number");
        }

        if (number3 == 0) {
            System.out.println(number3 + " is zero");
        }

        if (number3 < 0) {
            System.out.println(number3 + " is negative number");
        }


    }



}
