package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class MethodsWithArrays_TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] game = new char[9];

        for(int i=0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }



    public static String won(char[] x){
        String result = "";

        for (int i = 0; i < x.length-2; i++) {
            if (x[i] == 'X') {
                if ((x[i] == x[i+1] && x[i] == x[i+2])){
                    System.out.println("Player X won");
                    System.exit(0);
                } else if ((x[i] == x[i+3] && x[i] == x[i+6])){
                    System.out.println("Player X won");
                    System.exit(0);
                }
            }
        }

        for (int i = 0; i < x.length-2; i++) {
            if (x[i] == 'O') {
                if ((x[i] == x[i+1] && x[i] == x[i+2])){
                    System.out.println("Player O won");
                    System.exit(0);
                } else if ((x[i] == x[i+3] && x[i] == x[i+6])){
                    System.out.println("Player O won");
                    System.exit(0);
                }
            }
        }
        return result;
    }
}

/*
Write the method won(char[]) that should determine who won in tic-tac-toe game.

If X player won, return string: "Player X won"
If O player won, return string: "Player O won"
Example:

char[] game1 = {
  'X', 'X', 'X',
  '-', 'O', '-',
  '-', 'O', '-'
};

Result: Player X won
 */