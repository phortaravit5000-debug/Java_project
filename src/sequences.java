import java.util.Scanner;

public class sequences {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int limit = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= limit; i +=2 ){
            sum +=i ;
        }
        System.out.println("Sum of all even numbers from 1 to" + limit + ":" + sum);
    }
}


