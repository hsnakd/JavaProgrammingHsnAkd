package day45_Abstraction;

public abstract class PropertiesOfClass {

    int a = 100;
    static int b = 200;

    public PropertiesOfClass(int a){
        this.a =a;
    }

    static{
        b = 100;
    }

    public void method1(){
        System.out.println("Instance method");
    }

    public static void method2(){
        System.out.println("Static method");
    }

    public abstract void method3();

}

