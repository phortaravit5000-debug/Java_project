import java.util.Scanner;

public class userchoiceInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter your second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("======= Enter the operation =======");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Multiplication(*)");
        System.out.println("4. Division(/)");
        System.out.println("Enter your choice (1-4): ");

        int choice = scanner.nextInt();
        double result = 0;
        boolean validoperation = true;
        switch (choice){
            case 1:
             result = num1 + num2;
             System.out.println("The result is : " + result);
             break;
            case 2:
                result = num1 - num2;
                System.out.println("The result is "+ result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result is " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is " + result);
                }
                else {
                    System.out.println("the result is error ");
                    validoperation = false;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                    validoperation = false;


        }

    }

}
