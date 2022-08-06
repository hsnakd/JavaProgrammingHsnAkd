package day36_Inheritance.Z_4_SportsTask;

public class SportObject {
    public static void main(String[] args) {
        AmericanFootball americanFootball = new AmericanFootball(5,3,"qwerty");
        Baseball baseball = new Baseball(2,4,"asdfg");
        Basketball basketball = new Basketball(5,5,"zxcvbn");
        Football football = new Football(11,6, "qazwsx");

        System.out.println(americanFootball);
        System.out.println(baseball);
        System.out.println(basketball);
        System.out.println(football);

        football.play();
    }
}
