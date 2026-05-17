import java.util.Scanner;

public class Algorithm26_WordCount{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        int wordcount = 0;
        if(input !=null&&!input.trim().isEmpty()){
            wordcount = input.trim().split("\\s+").length;
        }
        System.out.println("Number of words in the sentence: " + wordcount);
        scanner.close();
    }
}