import java.util.Scanner;

public class AskUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 200;
        
        do{ // do while runs the condition once before checking for constant input for conditions to be met
        System.out.println("Enter a number greater than 100: ");
        i = scanner.nextInt();


        } while(i < 100);

        System.out.println("Your input is " + i); // output when user enters valid input. The while loop is satisfied

        scanner.close();

    }
}
