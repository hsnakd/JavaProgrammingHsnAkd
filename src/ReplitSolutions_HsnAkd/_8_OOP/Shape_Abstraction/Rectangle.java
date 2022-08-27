package ReplitSolutions_HsnAkd._8_OOP.Shape_Abstraction;

class Rectangle extends Shape{

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    @Override
    public double area() {
        return  width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }
}
/*
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
 */