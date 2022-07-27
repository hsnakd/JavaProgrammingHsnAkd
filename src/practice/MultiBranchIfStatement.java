package practice;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");

        int number = -5;

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }


        System.out.println("--------------------------------------------------");

        int score = 75;

        if (score >=90) {
            System.out.println("Grade : A");
        } else if (score >=80) {
            System.out.println("Grade : B");
        } else if (score >=70) {
            System.out.println("Grade : C");
        } else if (score >=60) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F");
        }


        System.out.println("--------------------------------------------------");







    }





}
