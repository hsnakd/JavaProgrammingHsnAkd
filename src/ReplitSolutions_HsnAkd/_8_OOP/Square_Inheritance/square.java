package ReplitSolutions_HsnAkd._8_OOP.Square_Inheritance;

public class square {

    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public square(double length) {
        this.length = length;
    }

    public double circumferenceCalc(){
        return length * 4;
    }
}
/*
This assignment will be to work on three shapes classes.
There is the `square` parent class and 2 child class of `square`.


-----------------
## square class

attributes:
- `length`( private double)

constructor:
- `square(double len)`: Sets the value for `length`

methods:
- `circumferenceCalc()`:
    input: none
    output: double returns the length attribute multiplied by 4.
- `getLength()`:
    input: none
    output: double getter for length

- `setLength()`:
    input: double , setter for length attribute
    output: none

-----------------
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
-----------------
## cube class extends square class

attributes:
- none

constructor:
- `cube(double len)`- sends len to the super constructor

methods:
- `circumferenceCalc()`:
    input: none
    output: double returns the parents (super) circumferenceCalc multiplied by 3

- `volumeCalc()`:

  input: none
  output: double returns the length (use getLength) multiplied by length and then multiplied by length again (basically length x length x length ).

-----------------
 */