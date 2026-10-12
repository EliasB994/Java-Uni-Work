public class EvenNumbers {
    public static void main(String[] args) {
        int[] Evens;
        Evens = new int[10]; // <-- Even Numbers Array
        int Total = 0;

        Evens[0] = 2;
        Evens[1] = 4;
        Evens[2] = 6;
        Evens[3] = 8;
        Evens[4] = 10;
        Evens[5] = 12;
        Evens[6] = 14;
        Evens[7] = 16;
        Evens[8] = 18;
        Evens[9] = 20;

        System.out.println(""); // <--- Whitespace for readability
        System.out.println("Even numbers: " + Evens[0] + " " + Evens[1] + " " + Evens[2] + " " + Evens[3] + " " + Evens[4] + " " + Evens[5] + " " + Evens[6] + " " + Evens[7] + " " + Evens[8] + " " + Evens[9]);
        System.out.println("");

        System.out.println("Addition of all even numbers: ");
        System.out.println("");
        
        for(int number : Evens) { // For each loop to go through each value of the array
        Total += number; // Total is equal to all the iterations added together
    }

    System.out.println("The total sum of all the even numbers is: " + Total);
            System.out.println("");

}

}
