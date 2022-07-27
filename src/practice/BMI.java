package practice;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {


		try (Scanner input = new Scanner(System.in)) {
			 
			
			System.out.println("Kilo (kg) : ");
			float kilo = input.nextFloat();
		
			System.out.println("Boy (m) : ");
			float boy = input.nextFloat();
		
			
			float vki = kilo/(boy*boy);
			
			System.out.println("VKİ : " + vki);
			
			
			

			if (vki<18.5) {
				
				System.out.println("Zayıf");
					
			}
			


			if (vki>=18.5 && vki<25.0) {
				
				System.out.println("Normal");				
			}
			
			
			
			if (vki>=25 && vki<30.0) {
				
				System.out.println("Kilolu");				
			}
			
			
			if (vki>=30) {
				
				System.out.println("Obez");				
			}
			
			
			
			
			
			
			
			
			
			
	

}
}
}