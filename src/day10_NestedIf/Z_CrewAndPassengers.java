package day10_NestedIf;

public class Z_CrewAndPassengers {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        int person = 300;
        int crews = 0;


        if (person>= 0 && person <= 300) {
            if (person<=50){
                crews = person / 2;
            } else if (person<=100) {
                crews = person / 3;
            } else if (person<=200){
                crews = person / 4;
            } else {
                crews = person / 5;
            }
            int passengers = person - crews;

            System.out.println("person = " + person);
            System.out.println("crews = " + crews);
            System.out.println("passengers = " + passengers);
        }   else {
            System.out.println("Invalid");
        }



        System.out.println("--------------------------------------------------");






        int number = 75;
        String result = "";

        boolean validNumber =  number == 50 || number == 75 || number ==100;

        if(validNumber){ // number: 50, 75, 100

            if(number == 50){
                result = "20 crew, 30 passengers";
            }else if( number == 75){
                result = "25 crew, 50 passengers";
            }else{
                result = "30 crew, 70 passengers";
            }

        }else{
            result = "Invalid Number";
        }


        System.out.println(result);



        System.out.println("--------------------------------------------------");

    }

}
/*
2. Create a class called CrewAndPassengers, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
