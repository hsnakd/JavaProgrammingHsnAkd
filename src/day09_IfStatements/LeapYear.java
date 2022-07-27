package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        int year = 2001;
        
        boolean isLeapYear =  year % 4 == 0;

        if (isLeapYear == true) {
            System.out.println(year + " is a leap year.");
        }
        if (isLeapYear == false) {
            System.out.println(year + " is not a leap year.");
        }


        System.out.println("--------------------------------------------------");

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        System.out.println("--------------------------------------------------");

    }


}
