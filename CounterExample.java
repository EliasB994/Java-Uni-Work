public class CounterExample {

    private static int counter = 0;
    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();

    }

    public static void myMethod() {

        counter ++;

        System.out.println("This method has been called "
        + counter + " time(s).");

    }

}

