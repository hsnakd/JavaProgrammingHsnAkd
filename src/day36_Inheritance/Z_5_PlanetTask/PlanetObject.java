package day36_Inheritance.Z_5_PlanetTask;

public class PlanetObject {
    public static void main(String[] args) {
        Earth earth = new Earth("q", 1,"a", "s", 12,123);
        Mercury mercury = new Mercury("q", 1,"a", "s", 12,123);
        Moon moon = new Moon("q", 1,"a", "s", 12,123);
        Venus venus = new Venus("q", 1,"a", "s", 12,123);

        System.out.println(earth);
        System.out.println(mercury);
        System.out.println(moon);
        System.out.println(venus);


    }
}


