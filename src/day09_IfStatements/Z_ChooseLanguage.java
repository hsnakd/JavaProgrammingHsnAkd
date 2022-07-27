package day09_IfStatements;

public class Z_ChooseLanguage {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        int language = 3;

        if (language == 1) {
            System.out.println("Hello, thanks for your call");
        } else if (language == 2) {
            System.out.println("Hola, gracias para llamar");
        } else if (language == 3) {
            System.out.println("Merhaba, Aradığınız için teşekkürler");
        }else if (language == 4) {
            System.out.println("Privet, spasibo za vash zvonok");
        }else if (language == 5) {
            System.out.println("Merci ,pour votre appel");
        }else  {
            System.out.println("Entered invalid number");
        }
        System.out.println("--------------------------------------------------");



    }


}
/*
3. Create a class called ChooseLanguage, Given an integer variable named selection
that has a number between 1~5, Write a program that can select the language based
on the number that's given in selection and prints the following message:

		for 1: Hello, thanks for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, Aradığınız için teşekkürler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

 */