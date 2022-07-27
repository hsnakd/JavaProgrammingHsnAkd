package day33_Statics.Z_6_Dog;


public class Dog {

    public String name;
    public String breed;
    public char size;
    public char gender;
    public int age;
    public String color;

    public static int  NumberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;
    public static boolean isFriendly;

    public Dog(String name, String breed, char size, char gender, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating");

    }

    public void play(){
        System.out.println(name + " is playing");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }


    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()


 */