import java.util.Scanner;

public class MenuSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Options 1-10
        int option;
        do { 
            System.out.println("Enter your option (1-10): ");
            option = scanner.nextInt();
        }while(!(option >= 1 && option <= 10));

        System.out.println("Your chosen option is: " + option);
        scanner.close();
    }
}
