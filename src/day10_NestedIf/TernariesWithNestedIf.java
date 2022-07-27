package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int score = 59;

        if (score >= 0 && score<=100) {

            if (score >= 60 ) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Number");
        }

        System.out.println((score >= 0 && score<=100) ? ((score>=60) ? "Passed" : "Failed") : "Invalid");




    }

}
