package ReplitSolutions_HsnAkd._6_Methods;

import java.util.Scanner;

public class PrintUniqueWords_Important {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }


    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE


        for (int i = 0; i < words.length; i++) {

            String element = words[i];
            int count =0;

            for (int j = 0; j < words.length; j++) {
                if(words[j].equals(element)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(element);
            }

        }



    }

}

/*
Complete the void method printUniqueWords() that will print only unique words from an array of strings.
Every single unique word should be printed from the new line.

Example:

input:[cube, code, python, code, rust, code, rust]

output:
cube
python
 */