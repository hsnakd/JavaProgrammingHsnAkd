package ReplitSolutions_HsnAkd._1_Variables;

import java.util.Scanner;

public class SchoolGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);


        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        String math = input.nextLine();
        double mathGrade = input.nextDouble();

        input.nextLine();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String biology = input.nextLine();
        double biologyGrade = input.nextDouble();

        input.nextLine();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String english = input.nextLine();
        double englishGrade = input.nextDouble();

        input.nextLine();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String chemistry = input.nextLine();
        double chemistryGrade = input.nextDouble();


        input.nextLine();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String music = input.nextLine();
        double musicGrade = input.nextDouble();


        System.out.println("Summary: " + math + " - " + mathGrade + ", " + biology + " - " + biologyGrade
                + ", " + english + " - " + englishGrade + ", " + chemistry + " - " + chemistryGrade
                + ", " + music + " - " + musicGrade );


        double averageGrade = (mathGrade + biologyGrade + englishGrade + chemistryGrade + musicGrade) / 5 ;

        System.out.println("Your average score is: " + averageGrade);
        System.out.println("Thank you for using Grader!\nGoodbye!");


    }
}
/*
Write the program that will calculate the average grade.
Use 5 String variables and 6 double variables to hold the subject and the grade value.
Build a summary with all the information by concatenating the subjects and grades.
Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4

Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!

 */