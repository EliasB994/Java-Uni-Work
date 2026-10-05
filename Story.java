import java.util.Scanner;  // Import the Scanner class
public class Story {
    public static void main(String[] args) {
        Scanner FirstName = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter a first name for the main male character: ");

            String MaleName = FirstName.nextLine();  // Read user input
    System.out.println("Confirmed name for main character is: " + MaleName);  // Output user input

        System.out.println("");

        System.out.print("Please enter a first name for the main female character: ");

                String FemaleName = FirstName.nextLine();  // Read user input
    System.out.println("Confirmed name for main female character is: " + FemaleName);  // Output user input

    System.out.println("");


        Scanner SecondName = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter a second name for the main male character: ");

            String MaleSecond = SecondName.nextLine();  // Read user input
    System.out.println("Confirmed second name for main character is: " + MaleSecond);  // Output user input

    System.out.println("");

        Scanner SecondFName = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter a second name for the main female character: ");

            String FemaleSecond = SecondFName.nextLine();  // Read user input
    System.out.println("Confirmed second name for main female character is: " + FemaleSecond);  // Output user input

    System.out.println("");


        Scanner Place = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter a second city/place where the story happens: ");

            String Location = Place.nextLine();  // Read user input
    System.out.println("Confirmed place where the story is set: " + Location);  // Output user input

    System.out.println("");
        Scanner Season = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter the name of a season: ");

            String Szn = Season.nextLine();  // Read user input
    System.out.println("Confirmed season of the year for when this story is set: " + Szn);  // Output user input

        System.out.println("");

        Scanner MurderWeapon = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter a murder weapon: ");

            String Wpn = MurderWeapon.nextLine();  // Read user input
    System.out.println("Confirmed murder weapon selected: " + Wpn);  // Output user input   

    }
}
