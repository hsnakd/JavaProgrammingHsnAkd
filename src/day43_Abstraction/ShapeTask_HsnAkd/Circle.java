package day43_Abstraction.ShapeTask_HsnAkd;

public class Circle extends Shape {
    private double r;
    private static double pi = Math.PI;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    public Circle(String name, double r) {
        super(name);
        setR(r);
    }

    @Override
    public double area() {
        return r * r * pi;
    }

    @Override
    public double perimeter() {
        return 2 * r * pi;
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