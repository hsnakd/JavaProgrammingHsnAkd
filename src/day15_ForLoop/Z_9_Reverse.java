package day15_ForLoop;

public class Z_9_Reverse {

    public static void main(String[] args) {
        String str = "I love Java, Java is fun programming language";
        //index:      0123456789

        String result = "";  // contain the reversed version of str
        //noopS nedooW



        for (int i = str.length() - 1; i >= 0; i--) { //i: index numbers of str (starting last index to index 0 )
            result += str.charAt(i); // adding each character to result
        }

        //
        System.out.println(result);     // egaugnal gnimmargorp nuf si avaJ ,avaJ evol I

    }

}
/*

9. Write a program that can reverse any given string

   			String str = "Java"; ==> avaJ
   		 //			      0123



 */