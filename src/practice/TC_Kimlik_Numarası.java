package practice;

import java.util.Scanner;

public class TC_Kimlik_Numarası {

	public static void main(String[] args) {


		try (Scanner input = new Scanner(System.in)) {
			 
			
			System.out.println("Kimlik No : ");
			long tcNo = input.nextLong();;
		
			
			long birHane 	= tcNo / 10000000000l;
 			int birRakam	= (int) birHane;
 			
			long ikiHane 	= tcNo / 1000000000l;
			int ikiRakam 	= (int) ikiHane %10;
			
			long ucHane 	= tcNo / 100000000l;
			int ucRakam 	= (int) ucHane %10;
			
			long dortHane 	= tcNo / 10000000l;
			int dortRakam 	= (int) dortHane %10;
			
			long besHane 	= tcNo / 1000000l;
			int besRakam 	= (int) besHane %10;
			
			long altiHane 	= tcNo / 100000l;
			int altiRakam 	= (int) altiHane %10;
			
			long yediHane 	= tcNo / 10000l;
			int yediRakam 	= (int) yediHane %10;
			
			long sekizHane 	= tcNo / 1000l;
			int sekizRakam 	= (int) sekizHane %10;
			
			long dokuzHane 	= tcNo / 100l;
			int dokuzRakam 	= (int) dokuzHane %10;
			
			long onHane 	= tcNo / 10l;
			int onRakam 	= (int) onHane %10 + 6;
			
		//	long onbirHane 	= tcNo / 1l;
		//	int onbirRakam 	= (int) tcNo %10 + 8;
			
			
			
		//	System.out.println(birRakam);
		//	System.out.println(ikiRakam);
		//	System.out.println(ucRakam);
		//	System.out.println(dortRakam);
		//	System.out.println(besRakam);
		//	System.out.println(altiRakam);
		//	System.out.println(yediRakam);
		//	System.out.println(sekizRakam);
		//	System.out.println(dokuzRakam);
		//	System.out.println(onRakam);
		//	System.out.println(onbirRakam);
			
			
			long tekler = (birRakam + ucRakam + besRakam + yediRakam + dokuzRakam) * 7; 
			long ciftler = (ikiRakam + dortRakam + altiRakam + sekizRakam) * 9 ; 
			long onRakamKontrol = tekler + ciftler;
			
			long onKontrol1 	= onRakamKontrol / 1l;
			int onKontrol 		= (int) onKontrol1 %10;
			

			
						
			
			
		//	System.out.println(tekler);
		//	System.out.println(ciftler);
		//	System.out.println(onKontrol);
			
			
			
			long ilkHane = tcNo / 10000000000l;
			
			String tc = "" + tcNo;
			boolean uzunluk = tc.length() == 11;
			
			int sonRakam = (int) tcNo %10;
			
			if (ilkHane != 0 && uzunluk == true && sonRakam %2 == 0 && onKontrol == onRakam) {
				System.out.println("BAŞARILI GİRİŞ");
				}
			
	
			if (ilkHane == 0 ) {
			System.out.println("Yanlış Kimlik Numarası / İlk Hane 0 Olamaz");
			}
			
			if (uzunluk == false ) {
				System.out.println("Yanlış Kimlik Numarası / 11 haneli Kimlik Numarasını Giriniz");
				}
			
			if (sonRakam % 2 != 0 ) {
				System.out.println("Yanlış Kimlik Numarası / Son Rakam Çift Olmalı");
				}
			
			if (onKontrol != onRakam ) {
				System.out.println("Yanlış Kimlik Numarası / Algoritma Hatası");
				}
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}
}