package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Arrays;

public class _2D_ArraysChessboard3 {
    public static void main(String[] args) {


        String[][] chessBoard = new String[8][8];

        int first=1;
        for(int i=0 ;i<=chessBoard.length-1;i++, first++)
        {  char ch='a';
            for(int j=0 ;j<=chessBoard.length-1;j++)
            {
                chessBoard[i][j] = first+""+ch; ch++;
            }

        }

        System.out.println(Arrays.deepToString(chessBoard));


    }
}
