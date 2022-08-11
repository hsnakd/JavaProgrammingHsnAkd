package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {


    public static void main(String[] args)  {

        System.out.println("Hello");

        //    sleep(2.5); // throws

        System.out.println("Hello world");


        System.out.println("-------------------------");


        try {
            System.out.println("try");
            sleep(2.5); // throws
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("catch");
        }
        System.out.println("Hello world");


        System.out.println("-------------------------");


        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); // try & catch

        System.out.println("Cydeo");


    }


    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep( (long) (seconds * 1000) );

    }




}
