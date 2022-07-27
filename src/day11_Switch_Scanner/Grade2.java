package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char grade = 'D';

        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;


            default:
                System.out.println("Invalid");
        }



        }


}


/*	3. a char variable named grade is given. use switch statement to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

 */