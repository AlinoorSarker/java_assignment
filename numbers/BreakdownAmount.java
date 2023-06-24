package numbers;

import java.util.Scanner;

public class BreakdownAmount {

    public static void main(String[] args) {
        // Create a scanner to read user input

        Scanner scanner = new Scanner(System.in);

        // Get the amount from the user
        System.out.println("Enter the amount: ");
        int amount = scanner.nextInt();

        // Create an array to store the notes
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        // Initialize the count of notes to 0
        int[] count = new int[notes.length];

        // Break down the amount and count the notes
        for (int i = 0; i < notes.length; i++) {
            count[i] = amount / notes[i];
            amount = amount % notes[i];
        }

        // Print the breakdown of the amount
        System.out.println("The breakdown of the amount is:");
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i] + " notes = " + count[i]);
        }
    }

}
