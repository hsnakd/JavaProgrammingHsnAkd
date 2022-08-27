package ReplitSolutions_HsnAkd._8_OOP.Shape_Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Circle c = new Circle(in.nextDouble());
        System.out.println(c.area());
        System.out.println(c.perimeter());

        Rectangle r = new Rectangle(in.nextDouble(), in.nextDouble());
        System.out.println(r.area());
        System.out.println(r.perimeter());


    }
}
/*
Define the Shapes

### Shape class
The base abstract class is the Shape class. It will define the base properties:

Abstract methods:
  - `area()`
  - `perimeter()`

-----------------

### Rectangle class
Inherits and implements the Shape class

Instance variables: (private):
- double: `width`, `length`

Create a constructor to set the values for the variables

Implement methods
```
  area: w*l
  perimeter: 2*(w+l)
```
-----------------

### Circle class

Inherits and implements the Shape class

Create a constructor to set the values for the variables

Instance variables: (private):
- double: `radius`

Implement methods
```
  area: π*r^2
  perimeter: 2*π*r
```

-----------------
 */