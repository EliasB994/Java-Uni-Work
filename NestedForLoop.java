import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {

    try(Scanner scanner = new Scanner(System.in)){    
        System.out.println("Please enter a number: ");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j<=i; j++)

                System.out.print("*");
            System.out.println();
        }
    }
}

}
