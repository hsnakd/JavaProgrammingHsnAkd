package day39_Recap.Z_1_AnimalTask;

public class FriendlyAnimal extends Animal {
    public static boolean isWild = false;
    public static boolean isFriendly = true;
    public static boolean isPlayable =  true;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void playing(){
        System.out.println(getName() + " is playing");
    }

    public void pet(){
        System.out.println(getName() + " is a pet");
    }


}
/*
2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */