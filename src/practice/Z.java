package practice;



public class Test {

    public Test() {
      
        System.out.print("a ");
    }
    public Test(int a) {
        this(2.5);
        System.out.print("b ");
    }
    public Test(double c) {
        System.out.print("c ");
    }

    public static void main(String[] args) {
        Test obj   = new Test(100);
    }

}