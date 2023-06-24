package numbers;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
        }
        System.out.println("The sum is: " + sum);
    }
}


