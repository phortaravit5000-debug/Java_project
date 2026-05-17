import java.util.Scanner;

public class Scanner_Input_Choice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + "! you  are " + age + " Years old");
        scanner.close();
    }
}