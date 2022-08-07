package day38_Inheritance.Z_2_AnimalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }
}
/*
	2. Create the following subclasses of Animal and override the eat method:
			1. Cat
					eat(): eats cat food

			2. Dog
					eat(): eats dog food

			3. Tiger
					eat(): eats deer

			4. Eagle
					eat(): eats snake

 */