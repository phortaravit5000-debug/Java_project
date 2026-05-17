import java.util.Scanner;
public class SumTwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("The sum of two numbers is: " + sum);
        scanner.close();
    }
}
