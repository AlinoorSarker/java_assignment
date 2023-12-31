package numbers;

public class FindSecondLargest {
    public static void main(String[] args) {
        int numbers = {5, 3, 9, 7, 4, 1, 8};
        int max = numbers[0];
        int secondMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax) {
                secondMax = numbers[i];
            }
        }
        System.out.println("The second largest element is " + secondMax);
    }

}
