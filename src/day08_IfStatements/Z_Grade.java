package day08_IfStatements;

public class Z_Grade {
    public static void main(String[] args) {

        byte grade =7;

        if (grade<=5){
            System.out.println("Elementary school");
        } else if (grade<=8){
            System.out.println("Middle school");
        } else if (grade<=12){
            System.out.println("High school");
        } else if (grade<=16){
            System.out.println("College");
        } else if (grade<=18){
            System.out.println("Grad School");
        } else {
            System.out.println("Invalid number");
        }

    }
}
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
        grade level and types are:
                1-5: Elementary school
                6-8: Middle school
                9-12: High school
                13-16: College
                17-18: Grad School
        Assume that the given number is 1 ~ 18
 */
