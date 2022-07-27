package ReplitSolutions_HsnAkd._4_Loops;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        int resultCat=0;
        int resultDog=0;

        for (int i = 0; i <= word.length()-3; i++) {
            String str = word.substring(i,i+3);
            if(str.equalsIgnoreCase("Cat")){
                countOfCats ++;
            }
            if(str.equalsIgnoreCase("Car")){
                countOfDogs ++;
            }
        }

        boolean result = countOfCats == countOfDogs;

        System.out.println(result);



    }
}
