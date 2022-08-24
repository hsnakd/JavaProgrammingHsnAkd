package day43_Abstraction.ShapeTask_HsnAkd;

public class Rectangle extends Shape {
    private double w;
    private double l;

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public Rectangle(String name, double w, double l) {
        super(name);
        setW(w);
        setL(l);
    }

    @Override
    public double area() {
        return w * l;
    }

    @Override
    public double perimeter() {
        return 2 * (w+l);
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