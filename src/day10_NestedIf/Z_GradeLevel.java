package day10_NestedIf;

public class Z_GradeLevel {

    public static void main(String[] args) {
        int grade = 18;


        if (grade<=18 && grade>=1) {

            if (grade<=5){
                System.out.println("Elementary school");
            } else if (grade<=8){
                System.out.println("Middle school");
            } else if (grade<=12){
                System.out.println("High school");
            } else if (grade<=16){
                System.out.println("College");
            } else {
                System.out.println("Grad School");
            }


        }    else {
            System.out.println("Invalid");
        }

    }

}

/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and
print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */