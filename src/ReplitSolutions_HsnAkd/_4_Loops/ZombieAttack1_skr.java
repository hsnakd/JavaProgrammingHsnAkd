package ReplitSolutions_HsnAkd._4_Loops;

import java.util.Scanner;

public class ZombieAttack1_skr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int days=0;

        while(inhabitants>0){
            System.out.println("Day " + days + " [" + inhabitants + "]");
            inhabitants/=2;
            days++;
        }
        System.out.println("---- EXTINCT ----");









    }
}

/*

A variable inhabitants represents a city and its respective populations.
City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
After each day, a city will lose half of its population.
Write a program to loop the city population and make it lose half of its population until population is zero.
Print the each day like below for each day:

Example - inhabitants are 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
Example- inhabitants are 0

---- EXTINCT ----
Example- inhabitants are 20

Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----


 */