package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Scanner;

public class ZombieAttack2_3 {
    public static void main(String[] args) {

     //   Scanner input = new Scanner(System.in);
     //   int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.

        int[] in = {3, 6, 0, 4, 3, 2, 7, 0};


        int day = 0;
        while (true){

            System.out.println("Day " +day + " ["+in[0]+", "+in[1]+", "+in[2]+", "+in[3]+", "+in[4]+", "+in[5]+", "+in[6]+", "+in[7]+"]" );

            day++;

            int count2 = 0;
            for (int each : in) {
                if (each == 0){
                    count2++;
                }
            }
            int[] zero = new int[count2];

            int j = 0;
            for (int i = 0; i < in.length; i++) {
                if (in[i] == 0){
                    zero[j++] = i;
                }
            }


            for (int i = 0; i < zero.length; i++){
                if (!(zero[i]-1 < 0)){
                    in[zero[i]-1] /= 2;
                }
                if (!(zero[i]+1 > in.length-1)){
                    in[zero[i]+1] /= 2;
                }

            }


            int count = 0;
            for (int each : in) {
                if (each == 0){
                    count++;
                }
            }
            if (count == in.length){
                System.out.println("Day " +day + " ["+0+", "+0+", "+0+", "+0+", "+0+", "
                        +0+", "+0+", "+0+"]" );
                System.out.println("---- EXTINCT ----");
                break;
            }
        }


    }
}
/*
An array inhabitants represents cities and their respective populations.
For example, the following arrays shows 8 cities and their respective populations:

[3, 6, 0, 4, 3, 2, 7, 0]
Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives.
After each day, any city that is adjacent to a zombie-ridden city will lose half of its population
(City that has a 0 population).

Write a program to loop though each city population
and make it lose half of its population if it is adjacent(right or left) to a city
with zero people until all cities have no humans are left.

Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Day 0 [10, 5, 0, 0, 4, 7, 6, 2]
Day 1 [10, 2, 0, 0, 2, 7, 6, 2]
Day 2 [10, 1, 0, 0, 1, 7, 6, 2]
Day 3 [10, 0, 0, 0, 0, 7, 6, 2]
Day 4  [5, 0, 0, 0, 0, 3, 6, 2]
Day 5  [2, 0, 0, 0, 0, 1, 6, 2]
Day 6  [1, 0, 0, 0, 0, 0, 6, 2]
Day 7  [0, 0, 0, 0, 0, 0, 3, 2]
Day 8  [0, 0, 0, 0, 0, 0, 1, 2]
Day 9  [0, 0, 0, 0, 0, 0, 0, 2]
Day 10 [0, 0, 0, 0, 0, 0, 0, 1]
Day 11 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
Copied!
Write the program in a way that it will handle any number of people in cities, above was just an example.
 */