import java.util.Scanner;

public class Algorithm34_AverageNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter ?: ");
        int count = scanner.nextInt();
        if(count <= 0){
            System.out.println("Please input a positive numbers of an elements: ");
            return;
        }
        double[] numbers = new double[count];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print("Number" + (i + 1) + " :");
            numbers[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);

        scanner.close();
    }
    }

