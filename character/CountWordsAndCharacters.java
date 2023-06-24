package character;

public class CountWordsAndCharacters {

    public static void main(String[] args) {
        String str = "I live in Bangladesh";
        int wordCount = 0;
        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            } else {
                charCount++;
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters without spaces: " + charCount);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
