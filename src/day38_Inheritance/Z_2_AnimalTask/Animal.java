package day38_Inheritance.Z_2_AnimalTask;

public class Animal {
    private String name;
    private String breed;
    private int age;
    private char gender;
    private String size;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String name, String breed, int age, char gender, String size, String color) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setGender(gender);
        setSize(size);
        setColor(color);
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
}
/*
Animal Task:
	1. Create a class named Animal:
			Variables:
				name, breed, age, gender, size, color

			Add a constructor to set all the fields

			methods:
				eat()
				toString()

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