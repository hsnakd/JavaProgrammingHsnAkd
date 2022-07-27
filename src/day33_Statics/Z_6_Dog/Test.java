package day33_Statics.Z_6_Dog;


public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lucy", "Husky", 'S', 'F', 5, "Black" );

        System.out.println(dog1);
        dog1.eat();
        dog1.play();
        dog1.sleep();



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