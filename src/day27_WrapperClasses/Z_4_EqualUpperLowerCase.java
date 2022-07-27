package day27_WrapperClasses;

public class Z_4_EqualUpperLowerCase {
    public static void main(String[] args) {
        String str = "JAVA java";
        boolean equal = equalUpperLowerCase(str);
        System.out.println(equal);
    }

    public static Boolean equalUpperLowerCase (String str){

        int upperCase = 0;
        int lowerCase = 0;

        for (char each : str.toCharArray()) {

            if( Character.isUpperCase(each) ){
                upperCase ++;
            }

            if( Character.isLowerCase(each) ){
                lowerCase ++;
            }

        }
        boolean result = (lowerCase == upperCase);
        return result;
    }
}




/*
4. Write program that returns true
    if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */