package ReplitSolutions_HsnAkd._4_Loops;

public class PrintLettersCombinations {
    public static void main(String[] args) {

        String letter = "zyxwv";

        for (int i = 0; i <= 4; i++) {


            for (int j = 0; j <= 4; j++) {
                System.out.print(letter.charAt(i));

                System.out.println(letter.charAt(j));
        }
        }




    }
}

/*

Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:

zz

zy

zx

zw

zv

yz

....

vv


 */