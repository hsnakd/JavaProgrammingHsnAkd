package day43_Abstraction.ShapeTask_HsnAkd;

public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    }


    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
/**

	Shape:
		name

		Encapsulate the fields

		Add constructor to set the fields

		area()
		perimeter()
		toString(): name, area, perimeter

 */