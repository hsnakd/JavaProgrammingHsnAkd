package day35_Encapsulation.Z_7_CredentialsTask;

public class CredentialsClass {

    private String username, password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if(!passwordValidation(password)){
            System.err.println("Invalid Password : " + password);
            System.exit(0);
        }
        this.password = password;
    }

    public CredentialsClass(String username, String password) {
        setUsername(username);
        setPassword(password);
    }
    public static boolean passwordValidation (String password){
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

        return result;
    }

    public String toString() {
        return "CredentialsClass{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isStrong='" + passwordValidation(password)  + '\'' +
                '}';
    }


}

/*
7. Credentials Task:*
    Create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)


 */