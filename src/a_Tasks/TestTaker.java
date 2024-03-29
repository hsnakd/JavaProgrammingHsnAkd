package a_Tasks;

import java.util.HashMap;

interface Shape {
    int getArea();
}

class Rectangle implements a_Tasks.Shape {
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

class Triangle implements a_Tasks.Shape {
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

class GeometryChatbot {
    public static String processCommands(String[] commands) {
        a_Tasks.ShapeManager shapeManager = new a_Tasks.ShapeManager();
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
            }
        }

        if (output.length() > 0) {
            output.deleteCharAt(output.length() - 1);
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String[] commands = {"add triangle t1 4 5", "area t1", "add rectangle r1 3 3", "area r1"};
        String result = processCommands(commands);
        System.out.println(result);
    }
}


public class TestTaker {
    public static String output(String[] commands) {
        a_Tasks.ShapeManager shapeManager = new a_Tasks.ShapeManager();
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
            }
        }

        if (output.length() > 0) {
            output.deleteCharAt(output.length() - 1);
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String[] commands = {"add triangle t1 4 5", "area t1", "add rectangle r1 3 3", "area r1"};
        String result = output(commands);
        System.out.println(result);
    }
}

