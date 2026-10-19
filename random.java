public class random {
    public static void main(String[] args) {
        int randomNumber = randomInt(100);
        if (randomNumber > 50)
            System.out.println("You are better than 50% of people at being random!");
    }

    public static int randomInt(int max) {
    return(int) (Math.random() * max) + 1;
        
    }

}
