package day21_ForEachLoop;

public class Z_6_NumberOfAppearances {
    public static void main(String[] args) {
        String [] words = {"java", "java", "python", "python", "java"};

        int countJava = 0;
        int countPython = 0;


        for (String word : words) {
            if (word.equalsIgnoreCase("java")){
                countJava++;
            }
            if (word.equalsIgnoreCase("python")){
                countPython++;
            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }
}

/*

6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.

   (similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)




 */