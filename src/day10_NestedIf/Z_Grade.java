package day10_NestedIf;

public class Z_Grade {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");

        char grade = 'A';

        if ((grade >='A' && grade<='D') || (grade == 'F')) {

            if (grade =='A') {
                System.out.println("Excellent");
            } else if (grade =='B') {
                System.out.println("Great Job");
            } else if (grade =='C') {
                System.out.println("Good");
            } else if (grade =='D') {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid");
        }


        System.out.println("--------------------------------------------------");



        boolean validGrade = (grade >= 'A' && grade <= 'D') || grade == 'F';

        String result = "";

        if(validGrade){

            if(grade == 'A'){
                result = "Excellent";
            } else if (grade == 'B') {
                result = "Great Job";
            }else if (grade == 'C') {
                result = "Good";
            }else if (grade == 'D') {
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{
            result = "Invalid Grade";
        }

        System.out.println(result);

        System.out.println("--------------------------------------------------");

    }

}

/*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */