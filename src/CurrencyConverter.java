import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in original currency: ");
        double originalAmount = scanner.nextDouble();
        System.out.print("Enter exchange rate (target currency per original currency): ");
        double exchangeRate = scanner.nextDouble();
        double targetAmount = originalAmount*exchangeRate;
        System.out.printf("Equivalent amount in target currency: %.2f\n", targetAmount);
        scanner.close();
    }
}
