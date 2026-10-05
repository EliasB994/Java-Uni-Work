import java.util.Scanner;  // Import the Scanner class
public class Story {
    public static void main(String[] args) {
        Scanner FirstName = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter a first name for the main male character: ");

            String MaleName = FirstName.nextLine();  // Read user input
    System.out.println("Confirmed name for main character is: " + MaleName);  // Output user input
        System.out.print("Please enter a first name for the main female character: ");

                String FemaleName = FirstName.nextLine();  // Read user input
    System.out.println("Confirmed name for main female character is: " + FemaleName);  // Output user input

    }
}
