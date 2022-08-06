package day40_FinalKeyword.ZooPackage;


public class Zoo {

    public final static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);
        Cat cat = new Cat("MM", "Van", 'F', "White", "Medium", 3);

        System.out.println(dog);
        System.out.println(cat);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();
        dog.eat();

        cat.drink();
        cat.eat();


    }

}
