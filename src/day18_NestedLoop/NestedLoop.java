package day18_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.print("Wooden Spoon - ");
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Wooden Spoon - ");
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Wooden Spoon - ");
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Wooden Spoon - ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------");

        for (int j = 0; j < 5; j++) { // j: 0, 1, 2, 3

            for (int i = 0; i < 5; i++) { //i: 0,1,2,3,4
                System.out.print("Cydeo - ");
            }

        }

        System.out.println();
        System.out.println("-------------------------------------------------");


    }

}
