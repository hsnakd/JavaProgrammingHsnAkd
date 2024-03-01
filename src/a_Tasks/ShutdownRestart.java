package a_Tasks;

import java.io.IOException;
import java.util.Scanner;

public class ShutdownRestart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option: ");
        System.out.println("1. Shutdown Mac");
        System.out.println("2. Restart Mac");

        int choice = scanner.nextInt();

        System.out.print("Enter delay time in seconds (0 for no delay): ");
        int delaySeconds = scanner.nextInt();

        switch (choice) {
            case 1:
                shutdownMac(delaySeconds);
                break;
            case 2:
                restartMac(delaySeconds);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static void shutdownMac(int delaySeconds) {
        String command = "osascript -e 'tell app \"System Events\" to shut down'";
        executeCommand(command, delaySeconds);
    }

    public static void restartMac(int delaySeconds) {
        String command = "osascript -e 'tell app \"System Events\" to restart'";
        executeCommand(command, delaySeconds);
    }

    private static void executeCommand(String command, int delaySeconds) {
        try {
            if (delaySeconds > 0) {
                System.out.println("Delaying execution for " + delaySeconds + " seconds...");
                Thread.sleep(delaySeconds * 1000);
            }

            Process process = Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", command});

            // ... (existing code)

            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Command executed successfully");
            } else {
                System.out.println("Error executing command. Exit code: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

