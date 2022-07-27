package day33_Statics.Z_3_Person;


import java.security.SecureRandom;

public class Person {

    public String name;
    public int age;
    public char gender;


    public static boolean isHuman;
    public static boolean hasNose;
    public static boolean hasWings;
    public static int numberOfHead = 1;
    public static int numberOfE = 2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " is eating");

    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }


    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}


/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */