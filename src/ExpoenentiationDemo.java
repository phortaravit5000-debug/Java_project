import java.util.Scanner;
public class ExpoenentiationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base: ");
        double base = scanner.nextInt();
        System.out.println("Enter exponent: ");
        double expo = scanner.nextInt();
        double exponential = Math.pow(base, expo);
        System.out.println("The result of  exponential is: " + exponential);
        scanner.close();

    }
}