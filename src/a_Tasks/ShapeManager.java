package a_Tasks;

import java.util.HashMap;

public class ShapeManager {
    private HashMap<String, Shape> shapes;

    public ShapeManager() {
        this.shapes = new HashMap<>();
    }

    public void addShape(String shapeType, String id, int param1, int param2) {
        Shape shape;
        switch (shapeType) {
            case "rectangle":
                shape = new Rectangle(param1, param2);
                break;
            case "triangle":
                shape = new Triangle(param1, param2);
                break;
            default:
                throw new IllegalArgumentException("Unsupported shape type");
        }
        shapes.put(id, shape);
    }

    public String getArea(String id) {
        Shape shape = shapes.get(id);
        if (shape != null) {
            return String.valueOf(shape.getArea());
        } else {
            return "error";
        }
    }
}
