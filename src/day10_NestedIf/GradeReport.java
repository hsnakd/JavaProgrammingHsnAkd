package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        int grade = 55;

        if (grade >=0 && grade<=100) {

            if (grade >= 90) {
                System.out.println("Excellent");
            } else if (grade >= 80) {
                System.out.println("Great");
            } else if (grade >= 70) {
                System.out.println("Good");
            } else if (grade >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid");
        }


        System.out.println("--------------------------------------------------");



        String result = ""; // Temporary

        if (grade >=0 && grade<=100) {

            if (grade >= 90) {
                result = "Excellent";
            } else if (grade >= 80) {
                result = "Great";
            } else if (grade >= 70) {
                result = "Good";
            } else if (grade >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "Invalid";
        }
        System.out.println(result);








        System.out.println("--------------------------------------------------");

    }
}
