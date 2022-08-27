package ReplitSolutions_HsnAkd._8_OOP.Square_Inheritance;

public class cube extends square{
    public cube(double length) {
        super(length);
    }

    public double circumferenceCalc(){
        return getLength() * 4 * 3 ;
    }

    public double volumeCalc(){
        return getLength() * getLength() * getLength() ;
    }
}

/*
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

 */