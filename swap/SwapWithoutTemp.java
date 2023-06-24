package swap;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Add a and b
        a = a + b;

        // Subtract b from the sum
        b = a - b;

        // Subtract a from the sum
        a = a - b;

        // Print the values of a and b
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
