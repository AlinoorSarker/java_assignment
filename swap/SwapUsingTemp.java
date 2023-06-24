package swap;

public class SwapUsingTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Create a temporary variable
        int temp = a;

        // Swap the values of a and b
        a = b;
        b = temp;

        // Print the values of a and b
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
