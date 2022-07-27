package ReplitSolutions_HsnAkd._2_Statements;

public class Recall {

    public static void main(String[] args) {
        int vehicleYear = 2000;
        boolean recall = (vehicleYear>=1995 && vehicleYear<=1998) ||  (vehicleYear>=2001 && vehicleYear<=2002) ||  (vehicleYear>=2004 && vehicleYear<=2006) ||  (vehicleYear>=2015 && vehicleYear<=2017) ;

        if (recall == true){
            System.out.println("Your vehicle needs to be recalled!");
        } else {
            System.out.println("Your vehicle is fine, enjoy!");
        }


    }
}
