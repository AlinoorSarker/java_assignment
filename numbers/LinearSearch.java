//Find the ksy in the given array using linear search method?

package numbers;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 7};
        int key = 3;
        int index = LinearSearch.linearSearch(numbers, key);
        if (index != -1) {
            System.out.println("the key" + key + "was found at index" + index);
        } else {
            System.out.println("the key " + key + "was not found");

        }
    }

    public static int linearSearch(int[] numbers, int key) {
//Loop through the array
        for (int i = 0; i < numbers.length; i++) {
//Check if the key at the currect index
            if (numbers[i] == key) {
                //Return the index of the key

                return i;
            }
        }
        return -1;

    }
}
