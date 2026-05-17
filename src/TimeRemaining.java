import java.util.Scanner;
public class TimeRemaining {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        System.out.println(hours + "hour" + "," + minutes + "minutes" + "and " + seconds + " second");
        scanner.close();
    }
}
