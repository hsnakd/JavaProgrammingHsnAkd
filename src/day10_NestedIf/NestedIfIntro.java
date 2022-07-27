package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");

        int score = 159;

        if (score >= 0 && score<=100) {

            if (score >= 60 ) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Number");
        }

        System.out.println("--------------------------------------------------");

        int age = 20;
        boolean hasID = true;

        if (hasID) {

            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        } else {
            System.out.println("You must have an ID");

        }


        System.out.println("--------------------------------------------------");


        int day =8;

        if (day>=1 && day <=7) {

            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        } else {
            System.out.println("Invalid");
        }







        System.out.println("--------------------------------------------------");

    }

}
