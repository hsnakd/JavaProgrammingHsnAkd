package day37_Inheritance.animalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, int age, String size, String color){
         super(name, breed, gender, age, size, color);
    }

    /*
        public String dogHouse;       // TODO : If the dog class has one more unique instance variable (dogHouse)
        public Dog(String name, String breed, char gender, int age, String size, String color, String dogHouse){
             super(name, breed, gender, age, size, color);
             this.dogHouse = dogHouse; // TODO : If there is a own instance variables we must set it manually
        }
    */

    public void bark(){
        System.out.println(name+" is barking");
    }




}