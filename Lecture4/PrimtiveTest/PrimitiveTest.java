public class PrimitiveTest {

    // This method accepts a primitive double.
    // Java creates a brand new variable here called 'simulatedPrice'
    public static void crashStock(double simulatedPrice) {
        System.out.println("Method starts. Clone price is: $" + simulatedPrice);

        // We change the clone to 0
        simulatedPrice = 0.0;

        System.out.println("Crash complete! Clone price is now: $" + simulatedPrice);
    }

    public static void main(String[] args) {
        // 1. We create our original variable in memory
        double actualSofiPrice = 18.50;

        // 2. We pass the primitive to the method.
        // Java reads '18.50', creates a clone, and hands the clone to the method.
        crashStock(actualSofiPrice);

        // 3. We print our original variable.
        System.out.println("Back in main! Actual SOFI price is: $" + actualSofiPrice);
    }
}