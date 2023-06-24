package numbers;

public class ShuffleArray {

    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = (int) (Math.random() * numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}


