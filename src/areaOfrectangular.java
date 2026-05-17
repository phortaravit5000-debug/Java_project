import java.util.Scanner;

public class areaOfrectangular {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your lenght");
        double l = scanner.nextDouble();
        System.out.println("Enter your width");
        double w = scanner.nextDouble();
        double area = l*w;
        System.out.println(area);
    }
}
