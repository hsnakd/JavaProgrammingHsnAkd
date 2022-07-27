package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int day = 7;
        switch (day) {
            case 1 :
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
                break;
            case 3 :
                System.out.println("Wed");
                break;
            case 4 :
                System.out.println("Thu");
                break;
            case 5 :
                System.out.println("Fri");
                break;
            case 6 :
                System.out.println("Sat");
                break;
            case 7 :
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid");
            // break; // It is optional
        }

    }
}
/*
    Case value MUST match with switch' data type and UNIQUE

        Switch' Data can not be long, float, double and boolean data types

        break: used for exiting the switch.
        if we don't give the break statement, switch statement continue to execute the next block(s) until the break statement or } of the switch

default block gets executed if none of the case blocks matched.
        there can only be one default block

        or logic we can use it in switch by declaring case blocks back to back

 */