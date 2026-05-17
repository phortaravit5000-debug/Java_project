import java.util.Scanner;

public class RatioCalculation {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your original currency: ");
        double original = scanner.nextDouble();
        System.out.println("Enter your target currency: ");
        double target = scanner.nextDouble();
        if (original == 0){
            System.out.println("Original cannot be zero: ");
        }
        else {
            double exchangeRate = original/target;
            System.out.println("the exchange rate is " + exchangeRate);
        }
        scanner.close();

    }
}
