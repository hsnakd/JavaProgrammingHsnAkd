package replitSolutions;//Given a string, print out true if the number of appearances of "cube" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
//
//        Example:
//
//
//        ```
//        input: We study cube not python
//
//        output: true
//        ```
//
//
//        Example:
//
//
//        ```
//        input: What's the difference between cube, javascript and python?
//
//        output: false
//        ```

import java.util.Scanner;

public class _4_011_Loops_EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countOfJava = 0;
        int countOfPython = 0;
        int lastIndex;

        //for cube
        lastIndex=0;
        while(lastIndex != -1)
        {
            lastIndex = sentence.indexOf("java",lastIndex);

            if(lastIndex != -1)
            {
                countOfJava ++;
                lastIndex += "java".length();
            }
        }

        //for python
        lastIndex=0;
        while(lastIndex != -1)
        {
            lastIndex = sentence.indexOf("python",lastIndex);

            if(lastIndex != -1)
            {
                countOfPython ++;
                lastIndex += "python".length();
            }
        }

        if(countOfJava==countOfPython)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
