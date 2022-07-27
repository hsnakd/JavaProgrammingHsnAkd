package day11_Switch_Scanner;

public class Z_CydeoBatches {
    public static void main(String[] args) {

        String batchType = "EU";

        switch (batchType){
            case "EU" :
                System.out.println("Tester times are  10-5 EST. M, T, W, Th, F.");
                break;
            case "US morning" :
                System.out.println("Tester times are 10-5 EST. M, T, Th, F.");
                break;
            case "US evening" :
                System.out.println("Tester times are 7-10 EST. M, T, W, Th, S, S");
                break;
            default:
                System.out.println("Invalid Batch");






        }

    }


}
/*
4. Create a class named Cydeo batches. In Cydeo we have three batch types:
        US morning, US evening, EU.

        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Tester times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Tester times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Tester times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */
