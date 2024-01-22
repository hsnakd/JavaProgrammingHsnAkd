package a_Tasks.a;

import java.util.HashMap;

// Define a Shape interface with an abstract method getArea()
interface Shape {
    int getArea();
}

// Implement Rectangle and Triangle classes that implement the Shape interface
class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (base * height) / 2;
    }
}

// Implement a ShapeManager class to handle the shapes and operations
class ShapeManager {
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
            // Add more shape types here in the future
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

public class GeometryChatbot {
    public static String processCommands(String[] commands) {
        ShapeManager shapeManager = new ShapeManager();
        StringBuilder output = new StringBuilder();

        for (String command : commands) {
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "add":
                    shapeManager.addShape(parts[1], parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]));
                    break;
                case "area":
                    output.append(shapeManager.getArea(parts[1])).append(",");
                    break;
                // Add more commands here in the future
            }
        }

        // Remove the trailing comma if there is any output
        if (output.length() > 0) {
            output.deleteCharAt(output.length() - 1);
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String[] commands = {"add triangle t1 4 5", "area t1", "add rectangle r1 3 3", "area r1"};
        String result = processCommands(commands);
        System.out.println(result);  // Output: "10,9"
    }
}
