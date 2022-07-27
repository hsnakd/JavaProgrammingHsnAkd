package ReplitSolutions_HsnAkd._5_Arrays;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        // TODO  ------------------------

        for (int i = 0; i < temps.length; i++) {
            total += temps[i];
        }

        avgTemp = total/temps.length;
        System.out.println(avgTemp);


    }
}

/*
Given an array temps with temperature values find and print the average value

Example:

input: 80 88 88 84 82 78 60 68

output: 78.5
 */