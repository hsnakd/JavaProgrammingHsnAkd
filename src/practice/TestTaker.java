package practice;

import a_Tasks.ShapeManager;

public class TestTaker {
    public static String output(String[] commands) {
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
        String result = output(commands);
        System.out.println(result);  // Output: "10,9"
    }
}
