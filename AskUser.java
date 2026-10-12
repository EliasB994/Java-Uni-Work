import java.util.Scanner;

public class AskUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 200; i = 50;
        
        do{
        System.out.println("Enter a number greater than 100: ");
        i = scanner.nextInt();


        } while(i < 100);

        System.out.println("Your input is " + i);

        scanner.close();

    }
}
