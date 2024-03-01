package a_Tasks;

public class TimeConversionExample {
    public static void main(String[] args) {
        int maxSeconds = Integer.MAX_VALUE;

        long minutes = maxSeconds / 60;
        long hours = maxSeconds / 3600;
        long days = maxSeconds / (24 * 3600);
        long weeks = maxSeconds / (7 * 24 * 3600);
        long months = maxSeconds / (30L * 24 * 3600);  // 'L' at the end to ensure long multiplication

        System.out.println("Max value in seconds: " + maxSeconds);
        System.out.println("Max value in minutes: " + minutes);
        System.out.println("Max value in hours: " + hours);
        System.out.println("Max value in days: " + days);
        System.out.println("Max value in weeks: " + weeks);
        System.out.println("Max value in months: " + months);
    }
}

