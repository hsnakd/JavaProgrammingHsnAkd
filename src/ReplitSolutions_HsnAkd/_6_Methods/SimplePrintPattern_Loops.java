package ReplitSolutions_HsnAkd._6_Methods;

public class SimplePrintPattern_Loops {
    public static void main(String[] args) {
        printHollowRect();
    }

    public static void printHollowRect(){
        // write your codes here
        int row = 5;
        int column = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
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