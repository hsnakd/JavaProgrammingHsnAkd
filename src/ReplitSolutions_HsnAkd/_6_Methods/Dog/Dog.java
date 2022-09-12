package ReplitSolutions_HsnAkd._6_Methods.Dog;

public class Dog extends Animal {

    private String breed;
    private int humanYears;

    public Dog(String name, int age, String breed) {
        super(name, age);
        setBreed(breed);
    }


    @Override
    public int getAgeInHumanYears() {
        if (getAge() <= 2) {
            humanYears = getAge() * 11;
        } else {
            humanYears = 22 + ((getAge()-2) * 5);
        }
        return humanYears;
    }

    public boolean equals() {
        return true;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHumanYears() {
        return humanYears;
    }

    public void setHumanYears(int humanYears) {
        this.humanYears = humanYears;
    }




    @Override
    public String toString() {
        return
                "Name: " + getName() + "\n" +
                "Breed: " + getBreed() + "\n" +
                "Age in calendar years: " + getAge() + "\n" +
                "Age in human years: " + getAgeInHumanYears();
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof Dog ){
            return breed.equals(((Dog)obj).getBreed());
        }else {
            return false;
        }
    }

}
/*
*   Write an abstract class Animal that contains 2 instance variables: `name` and `age`.
    -   Provide getters and setters for these variables. Add an abstract method `getAgeInHumanYears()`
    that returns int.
    -   Define 2 args constructor that initializes instance variables.

*   Write a class Dog that extends the Animal class. Define 2 instance variables for this class:
`breed` (String) and `humanYears` (int).
    -   Add a constructor that accepts three String parameters.
The value of the first is used to initialize the value of `name`,
the value of the second is used to initialize `age` and the value of the third is used to initialize `breed`.

>Use super() to call parent constructor.

- Override toString() method, so it will display Dog info as in the example below:

    Name: name
    Breed: breed
    Age in calendar years: years
    Age in human years: humanYears
>Hint: Use \n to print a text from a new line.

- Also, implement getAgeInHumanYears method, so It will convert dogs age into humans age as follows:

    if the dog's age is less or equals to 2, multiple age by 11;
    otherwise, human years is equals to: 22 + ((age-2) * 5);

- Override the `equals()` method for the `Dog` class that returns true if the dog’s name, age,
and breed match the same variables for the other object that is being compared.

*/