package strings;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        return word.equals(reverseWord);
    }

    public static void main(String[] args) {
        System.out.println("Is Civic a palindrome? " + isPalindrome("Civic"));
        System.out.println("Is One a palindrome? " + isPalindrome("One"));
    }
}
