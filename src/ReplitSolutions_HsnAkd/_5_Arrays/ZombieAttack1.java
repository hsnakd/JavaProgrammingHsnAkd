package ReplitSolutions_HsnAkd._5_Arrays;
import java.util.Scanner;

public class ZombieAttack1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
        //   int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.
        int i =0;
            do {
                System.out.println("Day " + i + " [" + inhabitants[0] + ", " + inhabitants[1] + ", " + inhabitants[2] + ", " + inhabitants[3] + ", " + inhabitants[4] + ", " + inhabitants[5] + ", " + inhabitants[6]+ ", "+ inhabitants[7]+"]" );


                    inhabitants[0] = inhabitants[0]/2;
                    inhabitants[1] = inhabitants[1]/2;
                    inhabitants[2] = inhabitants[2]/2;
                    inhabitants[3] = inhabitants[3]/2;
                    inhabitants[4] = inhabitants[4]/2;
                    inhabitants[5] = inhabitants[5]/2;
                    inhabitants[6] = inhabitants[6]/2;
                    inhabitants[7] = inhabitants[7]/2;
                    i++;


            } while (inhabitants[0] > 0 || inhabitants[1] > 0 || inhabitants[2] > 0 || inhabitants[3] > 0 || inhabitants[4] > 0 || inhabitants[5] > 0 || inhabitants[6] > 0 || inhabitants[7] > 0 ) ;

            System.out.println("Day " + i + " [" + 0 + ", " + 0 + ", " + 0 + ", " + 0 + ", " + 0 + ", " + 0 + ", " + 0 + ", " + 0 + "]" );


            System.out.println("---- EXTINCT ----");




        }

    }

/*
An array inhabitants represents cities and their respective populations.
For example, the following arrays shows 8 cities and their respective populations:

[3, 6, 0, 4, 3, 2, 7, 1]

Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives.
After each day, every city will lose half of its population.

Write a program to loop though each city population and make it lose half of its population until all cities
have no humans left. Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
Write the program in a way that it will handle any number of people in cities, above was just an example

Hint:

Below expression will print array in this format:

System.out.println(Arrays.toString(inhabitants)));

[3, 6, 0, 4, 3, 2, 7, 1]
 */