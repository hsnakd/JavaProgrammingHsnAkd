package day43_Abstraction.ShapeTask_HsnAkd;

public class Square extends Shape {
    private double s;

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public Square(String name, double s) {
        super(name);
        setS(s);
    }

    @Override
    public double area() {
        return s * s;
    }

    @Override
    public double perimeter() {
        return 4 * s;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name=" + getName() +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
	            Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)

				Square:
					area(): s * s
					perimeter: 4 * s

				Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi

 */