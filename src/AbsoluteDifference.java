import java.util.Scanner;
public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many items are in your cart? ");
        int itemCount = scanner.nextInt();

        if (itemCount <= 0) {
            System.out.println("Please enter a positive number of items.");
            return;
        }

        double subtotal = 0;

        System.out.println("Enter the price of each item:");
        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Item " + i + " price: $");
            double price = scanner.nextDouble();
            subtotal += price;
        }

        System.out.print("Enter tax rate (as percentage, e.g., 8.5 for 8.5%): ");
        double taxRate = scanner.nextDouble();

        double taxAmount = subtotal * (taxRate / 100);
        double totalCost = subtotal + taxAmount;

        System.out.printf("\nShopping Cart Summary:\n");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax (%.1f%%): $%.2f\n", taxRate, taxAmount);
        System.out.printf("Total Cost: $%.2f\n", totalCost);

        scanner.close();
    }
}
