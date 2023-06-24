package numbers;

public class FindDuplicateNumbers {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int number : numbers) {
            if (!set.add(number)) {
                System.out.println("Duplicate value: " + number + " at index " + set.indexOf(number));
            }
        }
    }
}

