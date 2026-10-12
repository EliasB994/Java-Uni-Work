import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter the number of rows: ");
            int rows = scanner.nextInt(); // scanner takes in number of rows from user input

            for (int i = 0; i < rows; i++) { // loop utilises user input rows
                for (int j = 0; j <= i; j++) { // inner for loop to run once for each column from the user input e.g., 5 or 8
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
