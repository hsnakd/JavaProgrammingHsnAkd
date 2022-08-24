package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true; // public & static & final by default

    /*
    public static void method1(){
        System.out.println(isFriendly);
    }
    */

    void play(); // abstract by default

    /** public abstract void play();   ==  abstract void play();   ==  void play();      */





}
