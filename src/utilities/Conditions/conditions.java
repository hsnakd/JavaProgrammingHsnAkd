package utilities.Conditions;

public class conditions {
    private String name;
    private int gradeNumber;
    private int age;
    private char gender;
    private char grade;
    private int quantity;

    int countSpecial =0;
    int countDigit =0;
    int countSpace =0;
    boolean result = true;


    public void setName01(String name) {
        if(name.isEmpty() || name.isBlank() || name == null ){

            for (int i = 0; i <  name.length(); i++) {

                if (Character.isDigit(name.charAt(i))) {
                    countDigit++;
                }else if ((name.charAt(i) == ' ')) {
                    countSpace++;
                }else {
                    countSpecial++;
                }
            }
            if (countSpecial > 0 && countDigit > 0 && countSpace==0) {
                result = false;
            }

            throw new RuntimeException("Invalid Make : " + name );
        }
        this.name = name;
    }



    public void setName0(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }



    public void setRadius(int gradeNumber) {
        if(gradeNumber <= 0 || gradeNumber > 100){
            System.err.println("Invalid Radius: "+gradeNumber);
            System.exit(1);
        }
        this.gradeNumber = gradeNumber;
    }

    public void setName2(String name) {
        if (name.isEmpty() || name.isBlank()) {
            return;
        }
        this.name = name;
    }

    public void setAge(int age){
        if( age < 5 || age > 90){
            return; // exits the method
        }

        this.age = age;
    }


    public void setGender0(char gender) {
        gender = (""+gender).toUpperCase().charAt(0);
        if ( !(gender == 'M' || gender =='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
    }




    public void setGender2(char gender) {

        if( !(gender =='M' || gender == 'F') ){
            return; // exits the method
        }

        this.gender = gender;
    }


    public void setGrade(char grade) {

        if( !( grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') ){
            return; // exits the method
        }

        this.grade = grade;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            return;
        }
        if (name.equalsIgnoreCase("toilet paper")) {
            this.quantity = 1;
        }
        this.quantity = quantity;
    }


}
/*
        1. name should not be set to null
        2. name should not be empty
        3. name should not contain any special character other than space

        4. age should not be set to negative
        5. gender must be valid
 */
