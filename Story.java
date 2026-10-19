import java.util.Scanner;  // Import the Scanner class
public class Story {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter a first name for the main male character: ");

            String MaleName = input.nextLine();  // Read user input
    System.out.println("Confirmed name for main character is: " + MaleName);  // Output user input

        System.out.println("");

        System.out.print("Please enter a first name for the main female character: ");

                String FemaleName = input.nextLine();  // Read user input
    System.out.println("Confirmed name for main female character is: " + FemaleName);  // Output user input

    System.out.println("");


        System.out.print("Please enter a second name for the main male character: ");

            String MaleSecond = input.nextLine();  // Read user input
    System.out.println("Confirmed second name for main character is: " + MaleSecond);  // Output user input

    System.out.println("");

        System.out.print("Please enter a second name for the main female character: ");

            String FemaleSecond = input.nextLine();  // Read user input
    System.out.println("Confirmed second name for main female character is: " + FemaleSecond);  // Output user input

    System.out.println("");


        System.out.print("Please enter a second city/place where the story happens: ");

            String Location = input.nextLine();  // Read user input
    System.out.println("Confirmed place where the story is set: " + Location);  // Output user input

    System.out.println("");
        System.out.print("Please enter the name of a season: ");

            String Szn = input.nextLine();  // Read user input
    System.out.println("Confirmed season of the year for when this story is set: " + Szn);  // Output user input

        System.out.println("");

        System.out.print("Please enter a murder weapon: ");

            String Wpn = input.nextLine();  // Read user input
    System.out.println("Confirmed murder weapon selected: " + Wpn);  // Output user input
    

    System.out.print("Please choose a secondary murder weapon: ");

        String Wpn_2 = input.nextLine();
        System.out.println("Secondary Murder Weapon Selected: " + Wpn_2);

    }
}
