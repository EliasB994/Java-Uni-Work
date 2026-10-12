import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String input;

            do {
                System.out.print("Please enter a number (or q to quit): ");
                input = scanner.nextLine();
            } while (!input.equalsIgnoreCase("q")); // added q so that while loop doesn't go on forever
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
