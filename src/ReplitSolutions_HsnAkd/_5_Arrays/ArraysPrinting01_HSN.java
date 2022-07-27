package ReplitSolutions_HsnAkd._5_Arrays;

public class ArraysPrinting01_HSN {
    public static void main(String[] args) {


        String[] arr = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String s : arr) {
            for (int i = 0; i < 3; i++) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }

    }
}

/*
The code provided in your main method will take in five Strings and save them into an array called arr.
Print out the first three letter of each element on seperate lines.
You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["hello", "how", "are", "you", "doing"]

Output:
hel
how
are
you
doi
 */