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



        Scanner SecondName = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter a second name for the main male character: ");

            String MaleSecond = SecondName.nextLine();  // Read user input
    System.out.println("Confirmed second name for main character is: " + MaleSecond);  // Output user input


        Scanner SecondFName = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter a second name for the main female character: ");

            String FemaleSecond = SecondFName.nextLine();  // Read user input
    System.out.println("Confirmed second name for main female character is: " + FemaleSecond);  // Output user input



        Scanner Place = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter a second city/place where the story happens: ");

            String Location = Place.nextLine();  // Read user input
    System.out.println("Confirmed place where the story is set: " + Location);  // Output user input

    }
}
