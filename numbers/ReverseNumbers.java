package numbers;

public class ReverseNumbers {
    public static void main(String[] args) {
        int number = 12345;
        while (number > 0) {
            System.out.println(number);
            number /=  10;
        }
    }

}
