public class LuckyNumbers { // the sum of the digits of a number between 1-30 is prime.
    // loop to go from 1 - 30 .. will send number to function to do the sum.
    //function sum the digits of a number (25) == 7
    // prime number is true or not (7) returns true (function)
    private static int sumOfDigits(int num) {
        int sumDigits = 0;
        sumDigits = num / 10;
        sumDigits += (num % 10); // so, whatever the number is divided by 10 and then output the remainder. 
    // 15 % 10 = 5
    // 46 % 10 = 6 REMAINDER "%" returns the remainder!

    // function sum my digits of a number that is smaller than 99

        return sumDigits;
        
        // 135 % 10 = 5 // + 
        // 135 / 10 = 13
        // 13 % 10 = 3 // +=
        // 13 / 10 = 1
        // 1 % 10 = 1 // +=
        // 1 / 10 = 0


private static int sumOfDigits(int num){
    int sumDigits = 0;
    while(num < 0){
        sumDigits += num % 10;
        num = num / 10; 
    }
}

    }

    // prime number boolean function for validation
    private static boolean isPrime(int num){
        // zero and one are not prime
        if(num < 2){
            return false;
        }

        for(int i = 2; i < num; i ++) { // going through the numbers up to my input to try a remainder.

            if(num % i == 0){ // if the remainder is 0, it is not a prime
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args){
        for(int i = 1; i < 30; i ++)
        {
            if(isPrime(sumOfDigits(i))){
                System.out.println( i + " is a lucky number");
            }
        }
    }
}
