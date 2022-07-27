package day27_WrapperClasses;

public class Z_3_Retrieve {
    public static void main(String[] args) {
        String str = "Wooden Spoon!123";
        String a = retrieve(str);
        System.out.println(a);

    }
    public static String retrieve (String str){

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (char each : str.toCharArray()) {

            if( Character.isLetter(each) ){
                letters +=  ("" + each);
            }

            if( Character.isDigit(each) ){
                digits +=  Integer.parseInt("" + each);
            }

            if( !Character.isLetterOrDigit(each) ){
                specialChars +=  ("" + each);
            }

        }
        String result = "Letters = " + letters + ", Digits = " + digits + ", Special Characters = " +  specialChars;

        return result;
    }



}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */