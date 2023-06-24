package numbers;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        // Create an array to store the random numbers
        int[] numbers = new int[10];

        // Generate 10 random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        // Print the numbers in the array
        System.out.println("The numbers are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Find the maximum number
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        // Find the minimum number
        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        // Print the maximum and minimum numbers
        System.out.println("The maximum number is " + maxNumber);
        System.out.println("The minimum number is " + minNumber);
    }
}
