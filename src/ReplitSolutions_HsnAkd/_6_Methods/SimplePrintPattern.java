package ReplitSolutions_HsnAkd._6_Methods;

public class SimplePrintPattern {
    public static void main(String[] args) {
        printHollowRect();
    }

    public static void printHollowRect(){
        // write your codes here
        System.out.println("*****");
        for (int i = 0; i <3 ; i++) {
            System.out.println("*   *");
        }
        System.out.println("*****");
    }

}

/*
Create a method printHollowRect that prints a 5 by 5 hollow rectangle:

*****
*   *
*   *
*   *
*****
hint: you will need to use two nested for loops,
and check if its the last or first iteration of the loop (so you will know whet to print "*" or " ")
 */