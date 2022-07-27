package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        int grade = 65;

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



        System.out.println((grade >= 0 && grade<=100) ? ((grade>=90) ? "Excellent" : (grade>=80) ? "Great" : (grade>=70) ? "Good" : (grade>=60) ? "Passed" : "Failed") : "Invalid");


        System.out.println("--------------------------------------------------");



        if (grade >=0 && grade<=100) {

            String result = (grade >= 0 && grade<=100) ? ((grade>=90) ? "Excellent" : (grade>=80) ? "Great" : (grade>=70) ? "Good" : (grade>=60) ? "Passed" : "Failed") : "Invalid";
            System.out.println("result = " + result);
        } else {
            System.out.println("Invalid");
        }




        System.out.println("--------------------------------------------------");

    }
}
