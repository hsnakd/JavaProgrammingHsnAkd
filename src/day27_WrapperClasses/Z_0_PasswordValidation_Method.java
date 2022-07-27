package day27_WrapperClasses;

public class Z_0_PasswordValidation_Method {
    public static void main(String[] args) {

        String password = "Hs6";

        boolean result = false;
        int countLength = password.length();
        int countUpper =0;
        int countLower =0;
        int countSpecial =0;
        int countDigit =0;
        int countSpace =0;


        if ( countLength < 8 ) {
            System.err.println("Password MUST be at least have 8 characters long");
        } else if (password.contains(" "))  {
            System.err.println("Password should not contain space");
        }else{
            for (int i = 0; i <  password.length(); i++) {

                if (Character.isUpperCase(password.charAt(i))) {
                    countUpper++;
                }else if (Character.isLowerCase(password.charAt(i))) {
                    countLower++;
                }else if (Character.isDigit(password.charAt(i))) {
                    countDigit++;
                }else if ((password.charAt(i) == ' ')) {
                    countSpace++;
                }else {
                    countSpecial++;
                }
            }


            if (countLength > 0 && countUpper > 0 && countLower > 0 && countSpecial > 0 && countDigit > 0 && countSpace==0) {
                result = true;
            }

            if (countLength == 0 ) {
                System.err.println("Password MUST be at least have 8 characters long");
            }
            if (countUpper == 0 ) {
                System.err.println("Password should at least contain one upper case letter");
            }
            if (countLower == 0 ) {
                System.err.println("Password should at least contain one lower case letter");
            }
            if (countSpecial == 0 ) {
                System.err.println("Password should at least contain one special characters");
            }
            if (countDigit == 0 ) {
                System.err.println("Password should at least contain a digit");
            }
            if (countSpace > 0 ) {
                System.err.println("Password should not contain space");
            }
        }


        System.out.println(result);
    }


}


/*
0. PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. Password should at least contain one upper case letter
                3. Password should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

 */