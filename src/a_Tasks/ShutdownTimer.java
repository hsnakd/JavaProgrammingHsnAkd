package a_Tasks;
import java.io.IOException;
import java.util.Scanner;

public class ShutdownTimer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter delay time in seconds (0 for no delay): ");
        int delaySeconds = scanner.nextInt();

                shutdownMac(delaySeconds);

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
                int hours = delaySeconds / 3600;
                int minutes = (delaySeconds % 3600) / 60;
                int seconds = delaySeconds % 60;

                System.out.print("Delaying execution for Shutdown " + hours + " Hours - " + minutes + " Minutes - " + seconds + " Seconds");

                for (int i = delaySeconds; i > 0; i--) {
                    hours = i / 3600;
                    minutes = (i % 3600) / 60;
                    seconds = i % 60;

                    System.out.print("\rTime remaining for Shutdown : " + hours + " Hours - " + minutes + " Minutes - " + seconds + " Seconds");
                    Thread.sleep(1000);
                }
            }

            System.out.println();  // Move to a new line

            Process process = Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", command});

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
