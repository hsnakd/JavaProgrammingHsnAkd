package day39_Recap.Z_1_AnimalTask;

public class WildAnimal extends Animal{
    public static boolean isWild = true;
    public static boolean isFriendly = false;
    public static boolean isPlayable = false;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt(){
        System.out.println(getName() + " is a hunting");
    }
}
/*
	3. Create a subclass of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */