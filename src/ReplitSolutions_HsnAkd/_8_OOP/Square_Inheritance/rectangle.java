package ReplitSolutions_HsnAkd._8_OOP.Square_Inheritance;

class rectangle extends square{

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public rectangle(double length, double height) {
        super(length);
        this.height = height;
    }

    public double circumferenceCalc(){
        return getLength() * 2 + height *2;
    }


}
/*
## rectangle class extends square class

attributes:
- `height`(private double)

constructor:
- `rectangle(double len, double height)` : sends len to the super constructor and sets height

methods:
- `circumferenceCalc()`:
    input: none
    output: double returns the length attribute multiplied by 2 plus the height multiplied by 2

- getters and setters:
    create a getter and setter for height attribute: `getHeight()` , `setHeight()`
 */