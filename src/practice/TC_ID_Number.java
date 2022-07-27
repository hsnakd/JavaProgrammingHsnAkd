package practice;

import java.util.Scanner;

public class TC_ID_Number {

	public static void main(String[] args) {


		try (Scanner input = new Scanner(System.in)) {
			 
			
			System.out.println("Enter Your ID Number : ");
			long IDNum = input.nextLong();;
		
			
			long firstDigit 	= IDNum / 10000000000l;
 			int oneNumber	= (int) firstDigit;
 			
			long secondDigit 	= IDNum / 1000000000l;
			int twoNumber 	= (int) secondDigit %10;
			
			long thirdDigit 	= IDNum / 100000000l;
			int threeNumber 	= (int) thirdDigit %10;
			
			long forthDigit 	= IDNum / 10000000l;
			int fourNumber 	= (int) forthDigit %10;
			
			long fifthDigit 	= IDNum / 1000000l;
			int fiveNumber 	= (int) fifthDigit %10;
			
			long sixthDigit 	= IDNum / 100000l;
			int sixNumber 	= (int) sixthDigit %10;
			
			long seventhDigit 	= IDNum / 10000l;
			int sevenNumber 	= (int) seventhDigit %10;
			
			long eighthDigit 	= IDNum / 1000l;
			int eightNumber 	= (int) eighthDigit %10;
			
			long ninthDigit 	= IDNum / 100l;
			int nineNumber 	= (int) ninthDigit %10;
			
			long tenthDigit 	= IDNum / 10l;
			int tenNumber 	= (int) tenthDigit %10 + 6;
			
		//	long eleventhDigit 	= IDNum / 1l;
		//	int elevenNumber 	= (int) IDNum %10 + 8;
			
			
			
		//	System.out.println(oneNumber);
		//	System.out.println(twoNumber);
		//	System.out.println(threeNumber);
		//	System.out.println(fourNumber);
		//	System.out.println(fiveNumber);
		//	System.out.println(sixNumber);
		//	System.out.println(sevenNumber);
		//	System.out.println(eightNumber);
		//	System.out.println(nineNumber);
		//	System.out.println(tenNumber);
		//	System.out.println(elevenNumber);
			
			
			long odds = (oneNumber + threeNumber + fiveNumber + sevenNumber + nineNumber) * 7; 
			long evens = (twoNumber + fourNumber + sixNumber + eightNumber) * 9 ; 
			long onNumberKontrol = odds + evens;
			
			long onKontrol1 	= onNumberKontrol / 1l;
			int onKontrol 		= (int) onKontrol1 %10;
			

			
						
			
			
		//	System.out.println(odds);
		//	System.out.println(evens);
		//	System.out.println(onKontrol);
			
			
			
			long ilkHane = IDNum / 10000000000l;
			
			String tc = "" + IDNum;
			boolean uzunluk = tc.length() == 11;
			
			int sonNumber = (int) IDNum %10;
			
			if (ilkHane != 0 && uzunluk == true && sonNumber %2 == 0 && onKontrol == tenNumber) {
				System.out.println("VALID ENTRY");
				}
			
	
			if (ilkHane == 0 ) {
			System.err.println("Invalid ID Number  / First Digit Cannot Be 0");
			}
			
			if (uzunluk == false ) {
				System.err.println("Invalid ID Number / Enter 11 Digit ID Number");
				}
			
			if (sonNumber % 2 != 0 ) {
				System.err.println("Invalid ID Number / Last Digit Must Be Even Number");
				}
			
			if (onKontrol != tenNumber ) {
				System.err.println("Invalid ID Number / Algorithm Error");
				}
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}
}