package ReplitSolutions_HsnAkd._5_Arrays;
import java.util.*;
public class _2D_ArraysChessboard {
    public static void main(String[] args) {


        String[][] chessBoard = new String[8][8];

        for (int i=0, k=1; i<8; i++, k++){
            char ch='a';
            for (int j=0 ; j<8; j++, ch++){
                chessBoard[i][j]=k+""+ch;
            }
        }

        System.out.println(Arrays.deepToString(chessBoard));


    }
}
