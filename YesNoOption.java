import java.util.Scanner;

public class YesNoOption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String proceed = "";
        do { 
            System.out.println("Do you wish to continue? YES/NO: ");

            proceed = scanner.nextLine().toUpperCase();
        } while(!(proceed.equals("YES") || proceed.equals("NO")));

        if (proceed.equals("YES"))
        {
            System.out.println("continuing with the programme...");
        } else {
            System.out.println("Goodbye.");
        }
    }
}
