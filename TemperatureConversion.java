import java.util.Scanner;

public class TemperatureConversion

{
    public static double conversionTemp(double fahrenheit) { // declare as double to hold decimals
        return (5.0/9.0) * (fahrenheit -32); // celius formula: Celsius = (Fahrenheit − 32) × 5/9


    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("PLease enter your Fahrenheit temperature:");
        double fahrenheitInput = userInput.nextDouble(); // variable that holds the fahrenheit input.
        double convertedOutput = TemperatureConversion.conversionTemp(fahrenheitInput);

        String calcMsg = "Calculating...";

        for (int i = 0; i < 3; i++) {
            System.out.println(calcMsg); // simple for loop to print the calculate message 3 times
        }
        System.out.print("Your Celsius conversion is");



        System.out.printf("%1.1f", convertedOutput);
    }
} 