import java.util.Scanner;

public class Average {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Enter third number");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3)/3;
        System.out.println("average" + average);
        scanner.close();
    }
}
