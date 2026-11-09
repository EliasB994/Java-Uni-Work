public class CartCalculator{
    // Method 1 Calculate the subtotal of an item (quantity, price)
    static public double calculateSubtotal(double price, int quantity){
        return price* quantity;

    }
   
    // Method 2 Calculate the total of my cart (quantity[], price[])
    static public double calculateCartTotal(double[] prices, int[] quantities){
        double total = 0;
        for(int i =0; i < prices.length; i++){
            total += calculateSubtotal(prices[i],quantities[i]);
        }
        return total;
    }

    // Method 3 Counts how many items in my cart
    public static int countItems(int[] quantities) {
        double totalQ = 0;
        for(int quantity: quantities) {
            totalQ += quantity;
        }
        return totalQ;
    }
    // Main Function to use
    public static void main(String[] args) {
        double[] prices = {3.5,4,5.5};
        int[] quantities = {5,4,3};

        System.out.println("Subtotal of an item: (3.5 price, 5 items)", calculateSubtotal(price, quantity));
        System.out.println("The total of the cart = ", calculateCartTotal(prices, quantities));
        System.out.println("The total items in the cart = ", countItems(quantities);;)
    }
}