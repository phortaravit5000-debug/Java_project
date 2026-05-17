import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion type: ");
        System.out.println("1. Celcius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celcius");
        System.out.println("Enter your chosie : 1 or 2");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter temperature in Celsius: ");
                double celcius = scanner.nextDouble();
                double fahrenheit = (celcius * 9.0 / 5.0 ) + 32;
                System.out.println("fahrenheit temperature is " + fahrenheit);
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celcius= (fahrenheit - 32)* (5.0 / 9.0);
                System.out.println("Celcius temperature is " + celcius);
                break;
            default:
                System.out.println("Invalud choice ");


        }
    }
}
