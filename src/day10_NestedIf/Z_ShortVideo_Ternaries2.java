package day10_NestedIf;

public class Z_ShortVideo_Ternaries2 {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        int score = 70;
        char grade;

        if (score >=90) {
            grade = 'A';
        } else if (score >=80) {
            grade = 'B';
        } else if (score >=70) {
            grade = 'C';
        } else if (score >=60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println(grade);



        System.out.println("--------------------------------------------------");
       char grade2 = (score>=90) ? 'A' : (score>=80) ? 'B' :(score>=70) ? 'C' :(score>=60) ? 'D' : 'F';
        System.out.println(grade2);

        System.out.println("--------------------------------------------------");


    }
}
