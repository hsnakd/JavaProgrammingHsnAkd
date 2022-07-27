package ReplitSolutions_HsnAkd._5_Arrays;
import java.util.*;
import java.lang.*;
public class ZZZZZ_2DArray {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many rows: ");
        int rows = keyboard.nextInt();

        System.out.print("How many columns: ");
        int cols = keyboard.nextInt();

        int[][] numbers = new int[rows][cols];

        int sum = (rows * cols);

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print("Enter the number you wish to be in row #" + (i + 1) + ", column #" + (j + 1) + ":");
                numbers[i][j] = keyboard.nextInt();
            }
        }

        System.out.print("\n");
        System.out.print("Your 2D array matrix:\n\n");

        System.out.print(Arrays.deepToString(numbers).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.print("\n\n");

        System.out.print("\nThe total of all the numbers is: " + getTotal(numbers) + "\n");
        System.out.print("The average of all the numbers is: " + getAverage(numbers, sum) + "\n");


        for(int i = 0; i < rows; i++)
        {
            System.out.print("\nThe highest value in row #" + (i + 1) + " is: " + getHighestInRow(numbers, i));
        }

        for(int i = 0; i < cols; i++)
        {
            System.out.print("\nThe highest value in column #" + (i + 1) + " is: " + getHighestInColumn(numbers, i));
        }


        System.out.print("\n\nWhat row would you like to add up?");
        int selectedRow = keyboard.nextInt();
        selectedRow--;
        System.out.print("The sum of the numbers in row #" + (selectedRow + 1) + " is: " + getRowTotal(numbers, selectedRow) + "\n");


        System.out.print("\nWhat column would you like to add up?");
        int selectedCol = keyboard.nextInt();
        selectedCol--;
        System.out.print("The sum of the numbers in column #" + (selectedCol + 1) + " is: " + getColumnTotal(numbers, selectedCol) + "\n");
    }

    public static double getTotal(int [][] arr)
    {
        double total = 0;

        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                total += arr[row][col];
            }
        }
        return total;
    }

    public static double getAverage(int [][] arr, int s)
    {
        double average = 0;

        average = (getTotal(arr) / s);

        return average;
    }

    public static int getRowTotal(int [][] arr, int row)
    {
        int rowTotal = 0;

        for(int i = 0; i < arr[row].length; i++)
        {
            rowTotal += arr[row][i];
        }

        return rowTotal;
    }

    public static int getColumnTotal(int [][] arr, int col)
    {
        int colTotal = 0;

        for(int i = 0; i < arr.length; i++)
        {
            colTotal += arr[i][col];
        }

        return colTotal;
    }

    public static int getHighestInRow(int [][] arr, int row)
    {
        int highestInRow = 0;

        for(int i = 0; i < arr[row].length; i++)
        {
            if(arr[row][i] > highestInRow)
            {
                highestInRow = arr[row][i];
            }
        }

        return highestInRow;
    }

    public static int getHighestInColumn(int [][] arr, int col)
    {
        int highestInCol = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i][col] > highestInCol)
            {
                highestInCol = arr[i][col];
            }
        }

        return highestInCol;
    }
}
