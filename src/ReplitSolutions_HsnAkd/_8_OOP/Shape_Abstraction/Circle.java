package ReplitSolutions_HsnAkd._8_OOP.Shape_Abstraction;

class Circle extends Shape{
    private double radius;
    private static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
/*
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
 */